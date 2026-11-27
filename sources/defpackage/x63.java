package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.File;
import java.util.LinkedHashSet;
public final class x63 extends yfb implements ur4 {
    public final byte a;
    public boolean b;
    public final Object c;

    public x63(Object obj, zw2 zw2Var, byte b) {
        super(1, zw2Var);
        this.a = b;
        this.c = obj;
    }

    @Override
    public final zw2 create(zw2 zw2Var) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return new x63((oja) obj, zw2Var, (byte) 0);
            default:
                return new x63((k83) obj, zw2Var, (byte) 1);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        zw2 zw2Var = (zw2) obj;
        switch (b) {
            case 0:
                return ((x63) create(zw2Var)).invokeSuspend(g9cVar);
            default:
                return ((x63) create(zw2Var)).invokeSuspend(g9cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        vx2 vx2Var = vx2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                g9c g9cVar = g9c.a;
                if (z) {
                    if (z) {
                        ixe.b(obj);
                        return g9cVar;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ixe.b(obj);
                oja ojaVar = (oja) obj2;
                this.b = true;
                SharedPreferences.Editor edit = ((SharedPreferences) ojaVar.e.getValue()).edit();
                LinkedHashSet<String> linkedHashSet = ojaVar.f;
                if (linkedHashSet == null) {
                    edit.clear();
                } else {
                    for (String str : linkedHashSet) {
                        edit.remove(str);
                    }
                }
                if (edit.commit()) {
                    if (((SharedPreferences) ojaVar.e.getValue()).getAll().isEmpty()) {
                        Context context = ojaVar.c;
                        String str2 = ojaVar.d;
                        if (Build.VERSION.SDK_INT >= 24) {
                            mja.a(context, str2);
                        } else {
                            File file = new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), str2.concat(".xml"));
                            File file2 = new File(file.getPath() + ".bak");
                            file.delete();
                            file2.delete();
                        }
                    }
                    if (linkedHashSet != null) {
                        linkedHashSet.clear();
                    }
                    if (g9cVar == vx2Var) {
                        return vx2Var;
                    }
                    return g9cVar;
                }
                su3.e("Unable to delete migrated keys from SharedPreferences.");
                return null;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        ixe.b(obj);
                        return obj;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ixe.b(obj);
                this.b = true;
                Object invoke = ((k83) obj2).invoke(this);
                if (invoke == vx2Var) {
                    return vx2Var;
                }
                return invoke;
        }
    }
}
