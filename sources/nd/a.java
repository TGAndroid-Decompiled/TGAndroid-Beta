package nd;

import a8.jd;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import m.w2;
public abstract class a implements ld.c, d, Serializable {
    private final ld.c completion;

    public a(ld.c cVar) {
        this.completion = cVar;
    }

    public ld.c create(ld.c completion) {
        kotlin.jvm.internal.i.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        ld.c cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public final ld.c getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i10;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i11;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v = eVar.v();
        if (v <= 1) {
            int i12 = -1;
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
                    i11 = num.intValue();
                } else {
                    i11 = 0;
                }
                i10 = i11 - 1;
            } catch (Exception unused) {
                i10 = -1;
            }
            if (i10 >= 0) {
                i12 = eVar.l()[i10];
            }
            w2 w2Var = f.f18777b;
            w2 w2Var2 = f.f18776a;
            if (w2Var == null) {
                try {
                    w2 w2Var3 = new w2(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    f.f18777b = w2Var3;
                    w2Var = w2Var3;
                } catch (Exception unused2) {
                    f.f18777b = w2Var2;
                    w2Var = w2Var2;
                }
            }
            if (w2Var != w2Var2 && (method = w2Var.f17896a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = w2Var.f17897b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = w2Var.f17898c;
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
            return new StackTraceElement(str, eVar.m(), eVar.f(), i12);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object invokeSuspend(Object obj);

    @Override
    public final void resumeWith(Object obj) {
        ld.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            ld.c cVar2 = aVar.completion;
            kotlin.jvm.internal.i.b(cVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == md.a.f18412a) {
                    return;
                }
            } catch (Throwable th2) {
                obj = jd.a(th2);
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

    public ld.c create(Object obj, ld.c completion) {
        kotlin.jvm.internal.i.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
