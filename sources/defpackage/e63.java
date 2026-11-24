package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.File;
import java.util.LinkedHashSet;
public final class e63 extends ccb implements qp4 {
    public final byte a;
    public boolean b;
    public final Object c;

    public e63(Object obj, fw2 fw2Var, byte b) {
        super(1, fw2Var);
        this.a = b;
        this.c = obj;
    }

    @Override
    public final fw2 create(fw2 fw2Var) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return new e63((vfa) obj, fw2Var, (byte) 0);
            default:
                return new e63((r73) obj, fw2Var, (byte) 1);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        fw2 fw2Var = (fw2) obj;
        switch (b) {
            case 0:
                return ((e63) create(fw2Var)).invokeSuspend(g5cVar);
            default:
                return ((e63) create(fw2Var)).invokeSuspend(g5cVar);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        bx2 bx2Var = bx2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                g5c g5cVar = g5c.a;
                if (z) {
                    if (z) {
                        qse.b(obj);
                        return g5cVar;
                    }
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qse.b(obj);
                vfa vfaVar = (vfa) obj2;
                this.b = true;
                SharedPreferences.Editor edit = ((SharedPreferences) vfaVar.e.getValue()).edit();
                LinkedHashSet<String> linkedHashSet = vfaVar.f;
                if (linkedHashSet == null) {
                    edit.clear();
                } else {
                    for (String str : linkedHashSet) {
                        edit.remove(str);
                    }
                }
                if (edit.commit()) {
                    if (((SharedPreferences) vfaVar.e.getValue()).getAll().isEmpty()) {
                        Context context = vfaVar.c;
                        String str2 = vfaVar.d;
                        if (Build.VERSION.SDK_INT >= 24) {
                            tfa.a(context, str2);
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
                    if (g5cVar == bx2Var) {
                        return bx2Var;
                    }
                    return g5cVar;
                }
                k93.f("Unable to delete migrated keys from SharedPreferences.");
                return null;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        qse.b(obj);
                        return obj;
                    }
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qse.b(obj);
                this.b = true;
                Object invoke = ((r73) obj2).invoke(this);
                if (invoke == bx2Var) {
                    return bx2Var;
                }
                return invoke;
        }
    }
}
