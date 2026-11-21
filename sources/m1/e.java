package m1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
public final class e extends kd.j implements rd.l {
    public final int f20349a;
    public int f20350b;
    public final Object f20351c;

    public e(Object obj, id.c cVar, int i7) {
        super(1, cVar);
        this.f20349a = i7;
        this.f20351c = obj;
    }

    @Override
    public final id.c create(id.c cVar) {
        switch (this.f20349a) {
            case 0:
                return new e((o1.d) this.f20351c, cVar, 0);
            default:
                return new e((x) this.f20351c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        id.c cVar = (id.c) obj;
        switch (this.f20349a) {
            case 0:
                return ((e) create(cVar)).invokeSuspend(gd.k.f13514a);
            default:
                return ((e) create(cVar)).invokeSuspend(gd.k.f13514a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Context context;
        String str;
        switch (this.f20349a) {
            case 0:
                jd.a aVar = jd.a.f17406a;
                int i7 = this.f20350b;
                gd.k kVar = gd.k.f13514a;
                if (i7 != 0) {
                    if (i7 == 1) {
                        b7.h.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    b7.h.b(obj);
                    o1.d dVar = (o1.d) this.f20351c;
                    this.f20350b = 1;
                    SharedPreferences.Editor edit = ((SharedPreferences) dVar.f21614e.getValue()).edit();
                    LinkedHashSet<String> linkedHashSet = dVar.f21615f;
                    if (linkedHashSet == null) {
                        edit.clear();
                    } else {
                        for (String str2 : linkedHashSet) {
                            edit.remove(str2);
                        }
                    }
                    if (edit.commit()) {
                        if (((SharedPreferences) dVar.f21614e.getValue()).getAll().isEmpty() && (context = dVar.f21613c) != null && (str = dVar.d) != null) {
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
                jd.a aVar2 = jd.a.f17406a;
                int i10 = this.f20350b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        b7.h.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b7.h.b(obj);
                this.f20350b = 1;
                Object invoke = ((x) this.f20351c).invoke(this);
                if (invoke == aVar2) {
                    return aVar2;
                }
                return invoke;
        }
    }
}
