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
public abstract class tn4 {
    public static final ji6 a = new ji6(2);
    public static final f03 b = new f03((byte) 20);

    public static fo4 a(Context context, List list) {
        fo4 fo4Var;
        q0f.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                if (i < list.size()) {
                    un4 un4Var = (un4) list.get(i);
                    ProviderInfo b2 = b(context.getPackageManager(), un4Var, context.getResources());
                    if (b2 == null) {
                        fo4Var = new fo4();
                        break;
                    }
                    arrayList.add(c(context, un4Var, b2.authority));
                    i++;
                } else {
                    fo4Var = new fo4(arrayList);
                    break;
                }
            }
            return fo4Var;
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, un4 un4Var, Resources resources) {
        f03 f03Var = b;
        ji6 ji6Var = a;
        q0f.a("FontProvider.getProvider");
        try {
            List list = un4Var.d;
            String str = un4Var.a;
            String str2 = un4Var.b;
            if (list == null) {
                list = tme.b(resources, 0);
            }
            ?? obj = new Object();
            obj.a = str;
            obj.b = str2;
            obj.c = list;
            ProviderInfo providerInfo = (ProviderInfo) ji6Var.a(obj);
            if (providerInfo == null) {
                providerInfo = packageManager.resolveContentProvider(str, 0);
                if (providerInfo != null) {
                    if (providerInfo.packageName.equals(str2)) {
                        Signature[] signatureArr = packageManager.getPackageInfo(providerInfo.packageName, 64).signatures;
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            arrayList.add(signature.toByteArray());
                        }
                        Collections.sort(arrayList, f03Var);
                        for (int i = 0; i < list.size(); i++) {
                            ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                            Collections.sort(arrayList2, f03Var);
                            if (arrayList.size() == arrayList2.size()) {
                                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                    if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                                        break;
                                    }
                                }
                                ji6Var.b(obj, providerInfo);
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

    public static go4[] c(Context context, un4 un4Var, String str) {
        rn4 aj3Var;
        int i;
        int i2;
        Uri withAppendedId;
        int i3;
        boolean z;
        q0f.a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                aj3Var = new xh4(context, build);
            } else {
                aj3Var = new aj3(context, build);
            }
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            q0f.a("ContentQueryWrapper.query");
            try {
                Cursor F = aj3Var.F(build, strArr, new String[]{un4Var.c});
                Trace.endSection();
                if (F != null && F.getCount() > 0) {
                    int columnIndex = F.getColumnIndex("result_code");
                    ArrayList arrayList2 = new ArrayList();
                    int columnIndex2 = F.getColumnIndex("_id");
                    int columnIndex3 = F.getColumnIndex("file_id");
                    int columnIndex4 = F.getColumnIndex("font_ttc_index");
                    int columnIndex5 = F.getColumnIndex("font_weight");
                    int columnIndex6 = F.getColumnIndex("font_italic");
                    while (F.moveToNext()) {
                        if (columnIndex != -1) {
                            i = F.getInt(columnIndex);
                        } else {
                            i = 0;
                        }
                        if (columnIndex4 != -1) {
                            i2 = F.getInt(columnIndex4);
                        } else {
                            i2 = 0;
                        }
                        if (columnIndex3 == -1) {
                            withAppendedId = ContentUris.withAppendedId(build, F.getLong(columnIndex2));
                        } else {
                            withAppendedId = ContentUris.withAppendedId(build2, F.getLong(columnIndex3));
                        }
                        Uri uri = withAppendedId;
                        if (columnIndex5 != -1) {
                            i3 = F.getInt(columnIndex5);
                        } else {
                            i3 = 400;
                        }
                        if (columnIndex6 != -1 && F.getInt(columnIndex6) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        arrayList2.add(new go4(uri, i2, i3, z, i));
                    }
                    arrayList = arrayList2;
                }
                if (F != null) {
                    F.close();
                }
                aj3Var.close();
                return (go4[]) arrayList.toArray(new go4[0]);
            } finally {
            }
        } finally {
        }
    }
}
