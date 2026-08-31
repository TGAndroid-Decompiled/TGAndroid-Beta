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
import androidx.biometric.f0;
import j7.j8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public abstract class c {
    public static final a0.j f16284a = new a0.j(2);
    public static final e5.f f16285b = new e5.f(25);

    public static b4.f a(Context context, List list) {
        j8.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                d dVar = (d) list.get(i10);
                ProviderInfo b10 = b(context.getPackageManager(), dVar, context.getResources());
                if (b10 == null) {
                    return new b4.f();
                }
                arrayList.add(c(context, dVar, b10.authority));
            }
            return new b4.f(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, d dVar, Resources resources) {
        e5.f fVar = f16285b;
        a0.j jVar = f16284a;
        j8.a("FontProvider.getProvider");
        try {
            List list = dVar.d;
            String str = dVar.f16286a;
            String str2 = dVar.f16287b;
            if (list == null) {
                list = h0.b.h(resources, 0);
            }
            ?? obj = new Object();
            obj.f16281a = str;
            obj.f16282b = str2;
            obj.f16283c = list;
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
                    Collections.sort(arrayList, fVar);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i10));
                        Collections.sort(arrayList2, fVar);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i11), (byte[]) arrayList2.get(i11))) {
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

    public static i[] c(Context context, d dVar, String str) {
        a f0Var;
        int i10;
        int i11;
        Uri withAppendedId;
        int i12;
        boolean z4;
        j8.a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                f0Var = new y5.h(context, build);
            } else {
                f0Var = new f0(context, build);
            }
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            j8.a("ContentQueryWrapper.query");
            Cursor r10 = f0Var.r(build, strArr, new String[]{dVar.f16288c});
            Trace.endSection();
            if (r10 != null && r10.getCount() > 0) {
                int columnIndex = r10.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = r10.getColumnIndex("_id");
                int columnIndex3 = r10.getColumnIndex("file_id");
                int columnIndex4 = r10.getColumnIndex("font_ttc_index");
                int columnIndex5 = r10.getColumnIndex("font_weight");
                int columnIndex6 = r10.getColumnIndex("font_italic");
                while (r10.moveToNext()) {
                    if (columnIndex != -1) {
                        i10 = r10.getInt(columnIndex);
                    } else {
                        i10 = 0;
                    }
                    if (columnIndex4 != -1) {
                        i11 = r10.getInt(columnIndex4);
                    } else {
                        i11 = 0;
                    }
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, r10.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, r10.getLong(columnIndex3));
                    }
                    Uri uri = withAppendedId;
                    if (columnIndex5 != -1) {
                        i12 = r10.getInt(columnIndex5);
                    } else {
                        i12 = 400;
                    }
                    if (columnIndex6 != -1 && r10.getInt(columnIndex6) == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    arrayList2.add(new i(uri, i11, i12, z4, i10));
                }
                arrayList = arrayList2;
            }
            if (r10 != null) {
                r10.close();
            }
            f0Var.close();
            return (i[]) arrayList.toArray(new i[0]);
        } finally {
            Trace.endSection();
        }
    }
}
