package hd;

import b8.ib;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class a implements fd.c, d, Serializable {
    private final fd.c completion;

    public a(fd.c cVar) {
        this.completion = cVar;
    }

    public fd.c create(fd.c completion) {
        kotlin.jvm.internal.j.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        fd.c cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public final fd.c getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i3;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i10;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v = eVar.v();
        if (v <= 1) {
            int i11 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(this);
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = 0;
                }
                i3 = i10 - 1;
            } catch (Exception unused) {
                i3 = -1;
            }
            if (i3 >= 0) {
                i11 = eVar.l()[i3];
            }
            f fVar = g.f14396b;
            f fVar2 = g.f14395a;
            if (fVar == null) {
                try {
                    f fVar3 = new f(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    g.f14396b = fVar3;
                    fVar = fVar3;
                } catch (Exception unused2) {
                    g.f14396b = fVar2;
                    fVar = fVar2;
                }
            }
            if (fVar != fVar2 && (method = fVar.f14392a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = fVar.f14393b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = fVar.f14394c;
                if (method3 != null) {
                    obj = method3.invoke(invoke2, null);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str2 = obj;
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i11);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object invokeSuspend(Object obj);

    @Override
    public final void resumeWith(Object obj) {
        fd.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            fd.c cVar2 = aVar.completion;
            kotlin.jvm.internal.j.b(cVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == gd.a.f12241a) {
                    return;
                }
            } catch (Throwable th2) {
                obj = ib.a(th2);
            }
            aVar.releaseIntercepted();
            if (cVar2 instanceof a) {
                cVar = cVar2;
            } else {
                cVar2.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public fd.c create(Object obj, fd.c completion) {
        kotlin.jvm.internal.j.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
