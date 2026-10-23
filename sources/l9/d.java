package l9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;
import r9.r;
public final class d implements qa.b {
    public final int f15958a;
    public final Object f15959b;
    public final Object f15960c;

    public d(int i10, Object obj, Object obj2) {
        this.f15958a = i10;
        this.f15960c = obj;
        this.f15959b = obj2;
    }

    @Override
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        boolean z10;
        switch (this.f15958a) {
            case 0:
                h hVar = (h) this.f15960c;
                Context context = (Context) this.f15959b;
                String d = hVar.d();
                na.a aVar = (na.a) hVar.d.a(na.a.class);
                ?? obj = new Object();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    if (i10 >= 24) {
                        context = f0.a.a(context);
                    } else {
                        context = null;
                    }
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + d, 0);
                boolean z11 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z11 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z11 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                obj.f48330a = z11;
                return obj;
            case 1:
                return new oa.g((Context) this.f15959b, (String) this.f15960c);
            default:
                r9.g gVar = (r9.g) this.f15960c;
                r9.a aVar2 = (r9.a) this.f15959b;
                r9.d dVar = aVar2.f45133f;
                ?? obj2 = new Object();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<r9.j> set = aVar2.f45132c;
                Set set2 = aVar2.f45134g;
                for (r9.j jVar : set) {
                    int i11 = jVar.f45150c;
                    int i12 = jVar.f45149b;
                    if (i11 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    r rVar = jVar.f45148a;
                    if (z10) {
                        if (i12 == 2) {
                            hashSet4.add(rVar);
                        } else {
                            hashSet.add(rVar);
                        }
                    } else if (i11 == 2) {
                        hashSet3.add(rVar);
                    } else if (i12 == 2) {
                        hashSet5.add(rVar);
                    } else {
                        hashSet2.add(rVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(r.a(na.a.class));
                }
                obj2.f6881b = DesugarCollections.unmodifiableSet(hashSet);
                obj2.f6882c = DesugarCollections.unmodifiableSet(hashSet2);
                obj2.f6880a = DesugarCollections.unmodifiableSet(hashSet3);
                obj2.d = DesugarCollections.unmodifiableSet(hashSet4);
                DesugarCollections.unmodifiableSet(hashSet5);
                obj2.e = gVar;
                return dVar.j2(obj2);
        }
    }

    public d(Context context, String str) {
        this.f15958a = 1;
        this.f15959b = context;
        this.f15960c = str;
    }
}
