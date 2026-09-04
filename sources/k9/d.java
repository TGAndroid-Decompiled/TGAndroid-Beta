package k9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;
import q9.r;
public final class d implements pa.b {
    public final int f14847a;
    public final Object f14848b;
    public final Object f14849c;

    public d(int i10, Object obj, Object obj2) {
        this.f14847a = i10;
        this.f14849c = obj;
        this.f14848b = obj2;
    }

    @Override
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        boolean z10;
        switch (this.f14847a) {
            case 0:
                h hVar = (h) this.f14849c;
                Context context = (Context) this.f14848b;
                String d = hVar.d();
                ma.a aVar = (ma.a) hVar.d.a(ma.a.class);
                ?? obj = new Object();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    if (i10 >= 24) {
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
                obj.f46980a = z11;
                return obj;
            case 1:
                return new na.g((Context) this.f14848b, (String) this.f14849c);
            default:
                q9.g gVar = (q9.g) this.f14849c;
                q9.a aVar2 = (q9.a) this.f14848b;
                q9.d dVar = aVar2.f44213f;
                ?? obj2 = new Object();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<q9.j> set = aVar2.f44211c;
                Set set2 = aVar2.f44214g;
                for (q9.j jVar : set) {
                    int i11 = jVar.f44231c;
                    int i12 = jVar.f44230b;
                    if (i11 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    r rVar = jVar.f44229a;
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
                    hashSet.add(r.a(ma.a.class));
                }
                obj2.f4796a = DesugarCollections.unmodifiableSet(hashSet);
                obj2.f4797b = DesugarCollections.unmodifiableSet(hashSet2);
                obj2.f4798c = DesugarCollections.unmodifiableSet(hashSet3);
                obj2.d = DesugarCollections.unmodifiableSet(hashSet4);
                DesugarCollections.unmodifiableSet(hashSet5);
                obj2.f4799e = gVar;
                return dVar.D(obj2);
        }
    }

    public d(Context context, String str) {
        this.f14847a = 1;
        this.f14848b = context;
        this.f14849c = str;
    }
}
