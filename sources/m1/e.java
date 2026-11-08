package m1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
public final class e extends kd.j implements rd.l {
    public final int f19363a;
    public int f19364b;
    public final Object f19365c;

    public e(Object obj, id.c cVar, int i7) {
        super(1, cVar);
        this.f19363a = i7;
        this.f19365c = obj;
    }

    @Override
    public final id.c create(id.c cVar) {
        switch (this.f19363a) {
            case 0:
                return new e((o1.d) this.f19365c, cVar, 0);
            default:
                return new e((x) this.f19365c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        id.c cVar = (id.c) obj;
        switch (this.f19363a) {
            case 0:
                return ((e) create(cVar)).invokeSuspend(gd.k.f13829a);
            default:
                return ((e) create(cVar)).invokeSuspend(gd.k.f13829a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Context context;
        String str;
        switch (this.f19363a) {
            case 0:
                jd.a aVar = jd.a.f16646a;
                int i7 = this.f19364b;
                gd.k kVar = gd.k.f13829a;
                if (i7 != 0) {
                    if (i7 == 1) {
                        af.b.c(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    af.b.c(obj);
                    o1.d dVar = (o1.d) this.f19365c;
                    this.f19364b = 1;
                    SharedPreferences.Editor edit = ((SharedPreferences) dVar.f20704e.getValue()).edit();
                    LinkedHashSet<String> linkedHashSet = dVar.f20705f;
                    if (linkedHashSet == null) {
                        edit.clear();
                    } else {
                        for (String str2 : linkedHashSet) {
                            edit.remove(str2);
                        }
                    }
                    if (edit.commit()) {
                        if (((SharedPreferences) dVar.f20704e.getValue()).getAll().isEmpty() && (context = dVar.f20703c) != null && (str = dVar.d) != null) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                o1.b.a(context, str);
                            } else {
                                File file = new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), str.concat(".xml"));
                                File file2 = new File(file.getPath() + ".bak");
                                file.delete();
                                file2.delete();
                            }
                        }
                        if (linkedHashSet != null) {
                            linkedHashSet.clear();
                        }
                        if (kVar == aVar) {
                            return aVar;
                        }
                    } else {
                        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
                    }
                }
                return kVar;
            default:
                jd.a aVar2 = jd.a.f16646a;
                int i10 = this.f19364b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        af.b.c(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                af.b.c(obj);
                this.f19364b = 1;
                Object invoke = ((x) this.f19365c).invoke(this);
                if (invoke == aVar2) {
                    return aVar2;
                }
                return invoke;
        }
    }
}
