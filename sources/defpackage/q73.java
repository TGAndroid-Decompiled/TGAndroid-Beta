package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.File;
import java.util.LinkedHashSet;
public final class q73 extends eeb implements rr4 {
    public final byte a;
    public boolean b;
    public final Object c;

    public q73(Object obj, px2 px2Var, byte b) {
        super(1, px2Var);
        this.a = b;
        this.c = obj;
    }

    @Override
    public final px2 create(px2 px2Var) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return new q73((xha) obj, px2Var, (byte) 0);
            default:
                return new q73((d93) obj, px2Var, (byte) 1);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        px2 px2Var = (px2) obj;
        switch (b) {
            case 0:
                return ((q73) create(px2Var)).invokeSuspend(g7cVar);
            default:
                return ((q73) create(px2Var)).invokeSuspend(g7cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        ly2 ly2Var = ly2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                g7c g7cVar = g7c.a;
                if (z) {
                    if (z) {
                        tue.b(obj);
                        return g7cVar;
                    }
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tue.b(obj);
                xha xhaVar = (xha) obj2;
                this.b = true;
                SharedPreferences.Editor edit = ((SharedPreferences) xhaVar.e.getValue()).edit();
                LinkedHashSet<String> linkedHashSet = xhaVar.f;
                if (linkedHashSet == null) {
                    edit.clear();
                } else {
                    for (String str : linkedHashSet) {
                        edit.remove(str);
                    }
                }
                if (edit.commit()) {
                    if (((SharedPreferences) xhaVar.e.getValue()).getAll().isEmpty()) {
                        Context context = xhaVar.c;
                        String str2 = xhaVar.d;
                        if (Build.VERSION.SDK_INT >= 24) {
                            vha.a(context, str2);
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
                    if (g7cVar == ly2Var) {
                        return ly2Var;
                    }
                    return g7cVar;
                }
                wa3.d("Unable to delete migrated keys from SharedPreferences.");
                return null;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        tue.b(obj);
                        return obj;
                    }
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tue.b(obj);
                this.b = true;
                Object invoke = ((d93) obj2).invoke(this);
                if (invoke == ly2Var) {
                    return ly2Var;
                }
                return invoke;
        }
    }
}
