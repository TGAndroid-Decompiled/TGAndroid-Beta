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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import n2.u;
import w7.m8;
public abstract class c {
    public static final a0.j f13912a = new a0.j(2);
    public static final a4.d f13913b = new a4.d(12);

    public static j4.f a(Context context, List list) {
        m8.a("FontProvider.getFontFamilyResult");
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
        a4.d dVar2 = f13913b;
        a0.j jVar = f13912a;
        m8.a("FontProvider.getProvider");
        try {
            List list = dVar.d;
            String str = dVar.f13914a;
            String str2 = dVar.f13915b;
            if (list == null) {
                list = h0.b.h(resources, 0);
            }
            ?? obj = new Object();
            obj.f13909a = str;
            obj.f13910b = str2;
            obj.f13911c = list;
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
        u uVar;
        int i10;
        int i11;
        ArrayList arrayList;
        Uri withAppendedId;
        int i12;
        boolean z10;
        m8.a("FontProvider.query");
        try {
            ArrayList arrayList2 = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                uVar = new u(context, build);
            } else {
                ?? obj = new Object();
                obj.f10700a = context.getContentResolver().acquireUnstableContentProviderClient(build);
                uVar = obj;
            }
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            m8.a("ContentQueryWrapper.query");
            Cursor I = uVar.I(build, strArr, new String[]{dVar.f13916c});
            Trace.endSection();
            if (I != null && I.getCount() > 0) {
                int columnIndex = I.getColumnIndex("result_code");
                ArrayList arrayList3 = new ArrayList();
                int columnIndex2 = I.getColumnIndex("_id");
                int columnIndex3 = I.getColumnIndex("file_id");
                int columnIndex4 = I.getColumnIndex("font_ttc_index");
                int columnIndex5 = I.getColumnIndex("font_weight");
                int columnIndex6 = I.getColumnIndex("font_italic");
                while (I.moveToNext()) {
                    if (columnIndex != -1) {
                        i10 = I.getInt(columnIndex);
                    } else {
                        i10 = 0;
                    }
                    if (columnIndex4 != -1) {
                        i11 = I.getInt(columnIndex4);
                    } else {
                        i11 = 0;
                    }
                    if (columnIndex3 == -1) {
                        arrayList = arrayList3;
                        withAppendedId = ContentUris.withAppendedId(build, I.getLong(columnIndex2));
                    } else {
                        arrayList = arrayList3;
                        withAppendedId = ContentUris.withAppendedId(build2, I.getLong(columnIndex3));
                    }
                    Uri uri = withAppendedId;
                    if (columnIndex5 != -1) {
                        i12 = I.getInt(columnIndex5);
                    } else {
                        i12 = 400;
                    }
                    int i13 = i12;
                    if (columnIndex6 != -1 && I.getInt(columnIndex6) == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ArrayList arrayList4 = arrayList;
                    arrayList4.add(new h(uri, i11, i13, z10, i10));
                    arrayList3 = arrayList4;
                }
                arrayList2 = arrayList3;
            }
            if (I != null) {
                I.close();
            }
            uVar.close();
            return (h[]) arrayList2.toArray(new h[0]);
        } finally {
            Trace.endSection();
        }
    }
}
