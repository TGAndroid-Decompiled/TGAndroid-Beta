package o0;

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
import c8.he;
import h9.f1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import jg.x;
public abstract class c {
    public static final a0.j f20681a = new a0.j(2);
    public static final x f20682b = new x(9);

    public static m4.f a(Context context, List list) {
        he.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < list.size(); i7++) {
                d dVar = (d) list.get(i7);
                ProviderInfo b10 = b(context.getPackageManager(), dVar, context.getResources());
                if (b10 == null) {
                    return new m4.f();
                }
                arrayList.add(c(context, dVar, b10.authority));
            }
            return new m4.f(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, d dVar, Resources resources) {
        x xVar = f20682b;
        a0.j jVar = f20681a;
        he.a("FontProvider.getProvider");
        try {
            List list = dVar.d;
            String str = dVar.f20683a;
            String str2 = dVar.f20684b;
            if (list == null) {
                list = h0.b.h(resources, 0);
            }
            ?? obj = new Object();
            obj.f20678a = str;
            obj.f20679b = str2;
            obj.f20680c = list;
            ProviderInfo providerInfo = (ProviderInfo) jVar.a(obj);
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
                    Collections.sort(arrayList, xVar);
                    for (int i7 = 0; i7 < list.size(); i7++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i7));
                        Collections.sort(arrayList2, xVar);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i10), (byte[]) arrayList2.get(i10))) {
                                    break;
                                }
                            }
                            jVar.b(obj, resolveContentProvider);
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
        a f1Var;
        int i7;
        int i10;
        Uri withAppendedId;
        int i11;
        boolean z9;
        he.a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                f1Var = new gf.g(context, build);
            } else {
                f1Var = new f1(context, build);
            }
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            he.a("ContentQueryWrapper.query");
            Cursor C0 = f1Var.C0(build, strArr, new String[]{dVar.f20685c});
            Trace.endSection();
            if (C0 != null && C0.getCount() > 0) {
                int columnIndex = C0.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = C0.getColumnIndex("_id");
                int columnIndex3 = C0.getColumnIndex("file_id");
                int columnIndex4 = C0.getColumnIndex("font_ttc_index");
                int columnIndex5 = C0.getColumnIndex("font_weight");
                int columnIndex6 = C0.getColumnIndex("font_italic");
                while (C0.moveToNext()) {
                    if (columnIndex != -1) {
                        i7 = C0.getInt(columnIndex);
                    } else {
                        i7 = 0;
                    }
                    if (columnIndex4 != -1) {
                        i10 = C0.getInt(columnIndex4);
                    } else {
                        i10 = 0;
                    }
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, C0.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, C0.getLong(columnIndex3));
                    }
                    Uri uri = withAppendedId;
                    if (columnIndex5 != -1) {
                        i11 = C0.getInt(columnIndex5);
                    } else {
                        i11 = 400;
                    }
                    if (columnIndex6 != -1 && C0.getInt(columnIndex6) == 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    arrayList2.add(new h(uri, i10, i11, z9, i7));
                }
                arrayList = arrayList2;
            }
            if (C0 != null) {
                C0.close();
            }
            f1Var.close();
            return (h[]) arrayList.toArray(new h[0]);
        } finally {
            Trace.endSection();
        }
    }
}
