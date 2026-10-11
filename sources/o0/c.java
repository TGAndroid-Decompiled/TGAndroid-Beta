package o0;

import a0.k;
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
import k2.g0;
import w7.a8;
public abstract class c {
    public static final k f16937a = new k(2);
    public static final a4.d f16938b = new a4.d(21);

    public static j4.f a(Context context, List list) {
        a8.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                d dVar = (d) list.get(i10);
                ProviderInfo b10 = b(context.getPackageManager(), dVar, context.getResources());
                if (b10 == null) {
                    return new j4.f();
                }
                arrayList.add(c(context, dVar, b10.authority));
            }
            return new j4.f(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, d dVar, Resources resources) {
        a4.d dVar2 = f16938b;
        k kVar = f16937a;
        a8.a("FontProvider.getProvider");
        try {
            List list = dVar.d;
            String str = dVar.f16939a;
            String str2 = dVar.f16940b;
            if (list == null) {
                list = h0.b.h(resources, 0);
            }
            ?? obj = new Object();
            obj.f16934a = str;
            obj.f16935b = str2;
            obj.f16936c = list;
            ProviderInfo providerInfo = (ProviderInfo) kVar.a(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider != null) {
                if (resolveContentProvider.packageName.equals(str2)) {
                    Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        arrayList.add(signature.toByteArray());
                    }
                    Collections.sort(arrayList, dVar2);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i10));
                        Collections.sort(arrayList2, dVar2);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i11), (byte[]) arrayList2.get(i11))) {
                                    break;
                                }
                            }
                            kVar.b(obj, resolveContentProvider);
                            return resolveContentProvider;
                        }
                    }
                    Trace.endSection();
                    return null;
                }
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        } finally {
            Trace.endSection();
        }
    }

    public static h[] c(Context context, d dVar, String str) {
        a g0Var;
        int i10;
        int i11;
        Uri withAppendedId;
        int i12;
        boolean z10;
        a8.a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                g0Var = new l2.f(context, build);
            } else {
                g0Var = new g0(context, build);
            }
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            a8.a("ContentQueryWrapper.query");
            Cursor X = g0Var.X(build, strArr, new String[]{dVar.f16941c});
            Trace.endSection();
            if (X != null && X.getCount() > 0) {
                int columnIndex = X.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = X.getColumnIndex("_id");
                int columnIndex3 = X.getColumnIndex("file_id");
                int columnIndex4 = X.getColumnIndex("font_ttc_index");
                int columnIndex5 = X.getColumnIndex("font_weight");
                int columnIndex6 = X.getColumnIndex("font_italic");
                while (X.moveToNext()) {
                    if (columnIndex != -1) {
                        i10 = X.getInt(columnIndex);
                    } else {
                        i10 = 0;
                    }
                    if (columnIndex4 != -1) {
                        i11 = X.getInt(columnIndex4);
                    } else {
                        i11 = 0;
                    }
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, X.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, X.getLong(columnIndex3));
                    }
                    Uri uri = withAppendedId;
                    if (columnIndex5 != -1) {
                        i12 = X.getInt(columnIndex5);
                    } else {
                        i12 = 400;
                    }
                    if (columnIndex6 != -1 && X.getInt(columnIndex6) == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    arrayList2.add(new h(uri, i11, i12, z10, i10));
                }
                arrayList = arrayList2;
            }
            if (X != null) {
                X.close();
            }
            g0Var.close();
            return (h[]) arrayList.toArray(new h[0]);
        } finally {
            Trace.endSection();
        }
    }
}
