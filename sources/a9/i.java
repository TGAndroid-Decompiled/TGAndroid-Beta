package a9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;
public final class i implements z9.b {
    public final int f243a;
    public final Object f244b;
    public final Object f245c;

    public i(int i10, Object obj, Object obj2) {
        this.f243a = i10;
        this.f244b = obj;
        this.f245c = obj2;
    }

    @Override
    public final Object get() {
        boolean z10;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f243a) {
            case 0:
                j jVar = (j) this.f244b;
                b bVar = (b) this.f245c;
                e eVar = bVar.f236f;
                ?? obj = new Object();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<m> set = bVar.f234c;
                Set set2 = bVar.f237g;
                for (m mVar : set) {
                    int i10 = mVar.f259c;
                    int i11 = mVar.f258b;
                    if (i10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    v vVar = mVar.f257a;
                    if (z10) {
                        if (i11 == 2) {
                            hashSet4.add(vVar);
                        } else {
                            hashSet.add(vVar);
                        }
                    } else if (i10 == 2) {
                        hashSet3.add(vVar);
                    } else if (i11 == 2) {
                        hashSet5.add(vVar);
                    } else {
                        hashSet2.add(vVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(v.a(w9.a.class));
                }
                obj.f211a = DesugarCollections.unmodifiableSet(hashSet);
                obj.f212b = DesugarCollections.unmodifiableSet(hashSet2);
                obj.f213c = DesugarCollections.unmodifiableSet(hashSet3);
                obj.d = DesugarCollections.unmodifiableSet(hashSet4);
                DesugarCollections.unmodifiableSet(hashSet5);
                obj.f214e = jVar;
                return eVar.I0(obj);
            case 1:
                u8.g gVar = (u8.g) this.f244b;
                Context context = (Context) this.f245c;
                String d = gVar.d();
                w9.a aVar = (w9.a) gVar.d.a(w9.a.class);
                ?? obj2 = new Object();
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 24) {
                    if (i12 >= 24) {
                        context = f0.b.a(context);
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
                obj2.f5843a = z11;
                return obj2;
            default:
                return new x9.g((Context) this.f244b, (String) this.f245c);
        }
    }
}
