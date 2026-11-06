package kd;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class a implements id.c, d, Serializable {
    private final id.c completion;

    public a(id.c cVar) {
        this.completion = cVar;
    }

    public id.c create(id.c completion) {
        kotlin.jvm.internal.j.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        id.c cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public final id.c getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i7;
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
                i7 = i10 - 1;
            } catch (Exception unused) {
                i7 = -1;
            }
            if (i7 >= 0) {
                i11 = eVar.l()[i7];
            }
            f fVar = g.f17260b;
            f fVar2 = g.f17259a;
            if (fVar == null) {
                try {
                    f fVar3 = new f(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    g.f17260b = fVar3;
                    fVar = fVar3;
                } catch (Exception unused2) {
                    g.f17260b = fVar2;
                    fVar = fVar2;
                }
            }
            if (fVar != fVar2 && (method = fVar.f17256a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = fVar.f17257b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = fVar.f17258c;
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
        id.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            id.c cVar2 = aVar.completion;
            kotlin.jvm.internal.j.b(cVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == jd.a.f16643a) {
                    return;
                }
            } catch (Throwable th2) {
                obj = af.b.b(th2);
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

    public id.c create(Object obj, id.c completion) {
        kotlin.jvm.internal.j.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
