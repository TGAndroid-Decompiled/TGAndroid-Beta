package l1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import b8.ib;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
public final class e extends hd.j implements od.l {
    public final int f17520a;
    public int f17521b;
    public final Object f17522c;

    public e(Object obj, fd.c cVar, int i3) {
        super(1, cVar);
        this.f17520a = i3;
        this.f17522c = obj;
    }

    @Override
    public final fd.c create(fd.c cVar) {
        switch (this.f17520a) {
            case 0:
                return new e((n1.d) this.f17522c, cVar, 0);
            default:
                return new e((x) this.f17522c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        fd.c cVar = (fd.c) obj;
        switch (this.f17520a) {
            case 0:
                return ((e) create(cVar)).invokeSuspend(dd.k.f8801a);
            default:
                return ((e) create(cVar)).invokeSuspend(dd.k.f8801a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Context context;
        String str;
        switch (this.f17520a) {
            case 0:
                gd.a aVar = gd.a.f12241a;
                int i3 = this.f17521b;
                dd.k kVar = dd.k.f8801a;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ib.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ib.b(obj);
                    n1.d dVar = (n1.d) this.f17522c;
                    this.f17521b = 1;
                    SharedPreferences.Editor edit = ((SharedPreferences) dVar.f20123e.getValue()).edit();
                    LinkedHashSet<String> linkedHashSet = dVar.f20124f;
                    if (linkedHashSet == null) {
                        edit.clear();
                    } else {
                        for (String str2 : linkedHashSet) {
                            edit.remove(str2);
                        }
                    }
                    if (edit.commit()) {
                        if (((SharedPreferences) dVar.f20123e.getValue()).getAll().isEmpty() && (context = dVar.f20122c) != null && (str = dVar.d) != null) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                n1.b.a(context, str);
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
                gd.a aVar2 = gd.a.f12241a;
                int i10 = this.f17521b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ib.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.b(obj);
                this.f17521b = 1;
                Object invoke = ((x) this.f17522c).invoke(this);
                if (invoke == aVar2) {
                    return aVar2;
                }
                return invoke;
        }
    }
}
