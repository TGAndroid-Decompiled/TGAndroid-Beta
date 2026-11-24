package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public abstract class ol4 {
    public static final fg6 a = new fg6(2);
    public static final mz2 b = new mz2((byte) 19);

    public static am4 a(Context context, List list) {
        am4 am4Var;
        wve.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                if (i < list.size()) {
                    pl4 pl4Var = (pl4) list.get(i);
                    ProviderInfo b2 = b(context.getPackageManager(), pl4Var, context.getResources());
                    if (b2 == null) {
                        am4Var = new am4();
                        break;
                    }
                    arrayList.add(c(context, pl4Var, b2.authority));
                    i++;
                } else {
                    am4Var = new am4(arrayList);
                    break;
                }
            }
            return am4Var;
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, pl4 pl4Var, Resources resources) {
        mz2 mz2Var = b;
        fg6 fg6Var = a;
        wve.a("FontProvider.getProvider");
        try {
            List list = pl4Var.d;
            String str = pl4Var.a;
            String str2 = pl4Var.b;
            if (list == null) {
                list = zhe.b(resources, 0);
            }
            ?? obj = new Object();
            obj.a = str;
            obj.b = str2;
            obj.c = list;
            ProviderInfo providerInfo = (ProviderInfo) fg6Var.a(obj);
            if (providerInfo == null) {
                providerInfo = packageManager.resolveContentProvider(str, 0);
                if (providerInfo != null) {
                    if (providerInfo.packageName.equals(str2)) {
                        Signature[] signatureArr = packageManager.getPackageInfo(providerInfo.packageName, 64).signatures;
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            arrayList.add(signature.toByteArray());
                        }
                        Collections.sort(arrayList, mz2Var);
                        for (int i = 0; i < list.size(); i++) {
                            ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                            Collections.sort(arrayList2, mz2Var);
                            if (arrayList.size() == arrayList2.size()) {
                                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                    if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                                        break;
                                    }
                                }
                                fg6Var.b(obj, providerInfo);
                            }
                        }
                        Trace.endSection();
                        return null;
                    }
                    throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
                }
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            return providerInfo;
        } finally {
            Trace.endSection();
        }
    }

    public static bm4[] c(Context context, pl4 pl4Var, String str) {
        ml4 s34Var;
        int i;
        int i2;
        Uri withAppendedId;
        int i3;
        boolean z;
        wve.a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                s34Var = new z24(context, build);
            } else {
                s34Var = new s34(context, build);
            }
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            wve.a("ContentQueryWrapper.query");
            try {
                Cursor G = s34Var.G(build, strArr, new String[]{pl4Var.c});
                Trace.endSection();
                if (G != null && G.getCount() > 0) {
                    int columnIndex = G.getColumnIndex("result_code");
                    ArrayList arrayList2 = new ArrayList();
                    int columnIndex2 = G.getColumnIndex("_id");
                    int columnIndex3 = G.getColumnIndex("file_id");
                    int columnIndex4 = G.getColumnIndex("font_ttc_index");
                    int columnIndex5 = G.getColumnIndex("font_weight");
                    int columnIndex6 = G.getColumnIndex("font_italic");
                    while (G.moveToNext()) {
                        if (columnIndex != -1) {
                            i = G.getInt(columnIndex);
                        } else {
                            i = 0;
                        }
                        if (columnIndex4 != -1) {
                            i2 = G.getInt(columnIndex4);
                        } else {
                            i2 = 0;
                        }
                        if (columnIndex3 == -1) {
                            withAppendedId = ContentUris.withAppendedId(build, G.getLong(columnIndex2));
                        } else {
                            withAppendedId = ContentUris.withAppendedId(build2, G.getLong(columnIndex3));
                        }
                        Uri uri = withAppendedId;
                        if (columnIndex5 != -1) {
                            i3 = G.getInt(columnIndex5);
                        } else {
                            i3 = 400;
                        }
                        if (columnIndex6 != -1 && G.getInt(columnIndex6) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        arrayList2.add(new bm4(uri, i2, i3, z, i));
                    }
                    arrayList = arrayList2;
                }
                if (G != null) {
                    G.close();
                }
                s34Var.close();
                return (bm4[]) arrayList.toArray(new bm4[0]);
            } finally {
            }
        } finally {
        }
    }
}
