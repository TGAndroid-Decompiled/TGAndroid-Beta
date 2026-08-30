package c9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;
public final class h implements ba.b {
    public final int f2157a;
    public final Object f2158b;
    public final Object f2159c;

    public h(int i10, Object obj, Object obj2) {
        this.f2157a = i10;
        this.f2158b = obj;
        this.f2159c = obj2;
    }

    @Override
    public final Object get() {
        boolean z4;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f2157a) {
            case 0:
                i iVar = (i) this.f2158b;
                b bVar = (b) this.f2159c;
                e eVar = bVar.f2151f;
                ?? obj = new Object();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<l> set = bVar.f2150c;
                Set set2 = bVar.f2152g;
                for (l lVar : set) {
                    int i10 = lVar.f2172c;
                    int i11 = lVar.f2171b;
                    if (i10 == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    t tVar = lVar.f2170a;
                    if (z4) {
                        if (i11 == 2) {
                            hashSet4.add(tVar);
                        } else {
                            hashSet.add(tVar);
                        }
                    } else if (i10 == 2) {
                        hashSet3.add(tVar);
                    } else if (i11 == 2) {
                        hashSet5.add(tVar);
                    } else {
                        hashSet2.add(tVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(t.a(y9.a.class));
                }
                obj.f2129a = DesugarCollections.unmodifiableSet(hashSet);
                obj.f2130b = DesugarCollections.unmodifiableSet(hashSet2);
                obj.f2131c = DesugarCollections.unmodifiableSet(hashSet3);
                obj.d = DesugarCollections.unmodifiableSet(hashSet4);
                DesugarCollections.unmodifiableSet(hashSet5);
                obj.e = iVar;
                return eVar.f0(obj);
            case 1:
                w8.g gVar = (w8.g) this.f2158b;
                Context context = (Context) this.f2159c;
                String d = gVar.d();
                y9.a aVar = (y9.a) gVar.d.a(y9.a.class);
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
                boolean z10 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z10 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z10 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                obj2.f6489a = z10;
                return obj2;
            default:
                return new z9.g((Context) this.f2158b, (String) this.f2159c);
        }
    }
}
