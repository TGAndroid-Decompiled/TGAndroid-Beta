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
public abstract class on4 {
    public static final fi6 a = new fi6(2);
    public static final x03 b = new x03((byte) 20);

    public static bo4 a(Context context, List list) {
        bo4 bo4Var;
        yxe.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                if (i < list.size()) {
                    pn4 pn4Var = (pn4) list.get(i);
                    ProviderInfo b2 = b(context.getPackageManager(), pn4Var, context.getResources());
                    if (b2 == null) {
                        bo4Var = new bo4();
                        break;
                    }
                    arrayList.add(c(context, pn4Var, b2.authority));
                    i++;
                } else {
                    bo4Var = new bo4(arrayList);
                    break;
                }
            }
            return bo4Var;
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, pn4 pn4Var, Resources resources) {
        x03 x03Var = b;
        fi6 fi6Var = a;
        yxe.a("FontProvider.getProvider");
        try {
            List list = pn4Var.d;
            String str = pn4Var.a;
            String str2 = pn4Var.b;
            if (list == null) {
                list = ake.b(resources, 0);
            }
            ?? obj = new Object();
            obj.a = str;
            obj.b = str2;
            obj.c = list;
            ProviderInfo providerInfo = (ProviderInfo) fi6Var.a(obj);
            if (providerInfo == null) {
                providerInfo = packageManager.resolveContentProvider(str, 0);
                if (providerInfo != null) {
                    if (providerInfo.packageName.equals(str2)) {
                        Signature[] signatureArr = packageManager.getPackageInfo(providerInfo.packageName, 64).signatures;
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            arrayList.add(signature.toByteArray());
                        }
                        Collections.sort(arrayList, x03Var);
                        for (int i = 0; i < list.size(); i++) {
                            ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                            Collections.sort(arrayList2, x03Var);
                            if (arrayList.size() == arrayList2.size()) {
                                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                    if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                                        break;
                                    }
                                }
                                fi6Var.b(obj, providerInfo);
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

    public static co4[] c(Context context, pn4 pn4Var, String str) {
        ai4 ai4Var;
        int i;
        int i2;
        Uri withAppendedId;
        int i3;
        boolean z;
        yxe.a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                ai4Var = new ai4(context, build);
            } else {
                ?? obj = new Object();
                obj.a = context.getContentResolver().acquireUnstableContentProviderClient(build);
                ai4Var = obj;
            }
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            yxe.a("ContentQueryWrapper.query");
            try {
                Cursor M = ai4Var.M(build, strArr, new String[]{pn4Var.c});
                Trace.endSection();
                if (M != null && M.getCount() > 0) {
                    int columnIndex = M.getColumnIndex("result_code");
                    ArrayList arrayList2 = new ArrayList();
                    int columnIndex2 = M.getColumnIndex("_id");
                    int columnIndex3 = M.getColumnIndex("file_id");
                    int columnIndex4 = M.getColumnIndex("font_ttc_index");
                    int columnIndex5 = M.getColumnIndex("font_weight");
                    int columnIndex6 = M.getColumnIndex("font_italic");
                    while (M.moveToNext()) {
                        if (columnIndex != -1) {
                            i = M.getInt(columnIndex);
                        } else {
                            i = 0;
                        }
                        if (columnIndex4 != -1) {
                            i2 = M.getInt(columnIndex4);
                        } else {
                            i2 = 0;
                        }
                        ArrayList arrayList3 = arrayList2;
                        if (columnIndex3 == -1) {
                            withAppendedId = ContentUris.withAppendedId(build, M.getLong(columnIndex2));
                        } else {
                            withAppendedId = ContentUris.withAppendedId(build2, M.getLong(columnIndex3));
                        }
                        Uri uri = withAppendedId;
                        if (columnIndex5 != -1) {
                            i3 = M.getInt(columnIndex5);
                        } else {
                            i3 = 400;
                        }
                        int i4 = i3;
                        if (columnIndex6 != -1 && M.getInt(columnIndex6) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        arrayList3.add(new co4(uri, i2, i4, z, i));
                        arrayList2 = arrayList3;
                    }
                    arrayList = arrayList2;
                }
                if (M != null) {
                    M.close();
                }
                ai4Var.close();
                return (co4[]) arrayList.toArray(new co4[0]);
            } finally {
            }
        } finally {
        }
    }
}
