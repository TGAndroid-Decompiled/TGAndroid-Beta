package m9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;
import s9.r;
public final class d implements ra.b {
    public final int f18371a;
    public final Object f18372b;
    public final Object f18373c;

    public d(int i10, Object obj, Object obj2) {
        this.f18371a = i10;
        this.f18373c = obj;
        this.f18372b = obj2;
    }

    @Override
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        boolean z10;
        switch (this.f18371a) {
            case 0:
                h hVar = (h) this.f18373c;
                Context context = (Context) this.f18372b;
                String d = hVar.d();
                oa.a aVar = (oa.a) hVar.d.a(oa.a.class);
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
                obj.f51142a = z11;
                return obj;
            case 1:
                return new pa.g((Context) this.f18372b, (String) this.f18373c);
            default:
                s9.g gVar = (s9.g) this.f18373c;
                s9.a aVar2 = (s9.a) this.f18372b;
                s9.d dVar = aVar2.f47983f;
                ?? obj2 = new Object();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<s9.j> set = aVar2.f47982c;
                Set set2 = aVar2.f47984g;
                for (s9.j jVar : set) {
                    int i11 = jVar.f48000c;
                    int i12 = jVar.f47999b;
                    if (i11 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    r rVar = jVar.f47998a;
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
                    hashSet.add(r.a(oa.a.class));
                }
                obj2.f614a = DesugarCollections.unmodifiableSet(hashSet);
                obj2.f615b = DesugarCollections.unmodifiableSet(hashSet2);
                obj2.f616c = DesugarCollections.unmodifiableSet(hashSet3);
                obj2.d = DesugarCollections.unmodifiableSet(hashSet4);
                DesugarCollections.unmodifiableSet(hashSet5);
                obj2.e = gVar;
                return dVar.d1(obj2);
        }
    }

    public d(Context context, String str) {
        this.f18371a = 1;
        this.f18372b = context;
        this.f18373c = str;
    }
}
