package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class of0 implements fw2, cx2, Serializable {
    private final fw2 completion;

    public of0(fw2 fw2Var) {
        this.completion = fw2Var;
    }

    public fw2 create(fw2 fw2Var) {
        fw2Var.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override
    public cx2 getCallerFrame() {
        fw2 fw2Var = this.completion;
        if (fw2Var instanceof cx2) {
            return (cx2) fw2Var;
        }
        return null;
    }

    public final fw2 getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i2;
        n83 n83Var = (n83) getClass().getAnnotation(n83.class);
        String str2 = null;
        if (n83Var == null) {
            return null;
        }
        int v = n83Var.v();
        if (v <= 1) {
            int i3 = -1;
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
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                i = i2 - 1;
            } catch (Exception unused) {
                i = -1;
            }
            if (i >= 0) {
                i3 = n83Var.l()[i];
            }
            pe7 pe7Var = tad.b;
            pe7 pe7Var2 = tad.a;
            if (pe7Var == null) {
                try {
                    pe7 pe7Var3 = new pe7(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    tad.b = pe7Var3;
                    pe7Var = pe7Var3;
                } catch (Exception unused2) {
                    tad.b = pe7Var2;
                    pe7Var = pe7Var2;
                }
            }
            if (pe7Var != pe7Var2 && (method = pe7Var.a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = pe7Var.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = pe7Var.c;
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
                str = n83Var.c();
            } else {
                str = str2 + '/' + n83Var.c();
            }
            return new StackTraceElement(str, n83Var.m(), n83Var.f(), i3);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
    }

    public Object invokeSuspend(Object obj) {
        qse.b(obj);
        return g5c.a;
    }

    @Override
    public final void resumeWith(Object obj) {
        while (true) {
            of0 of0Var = this;
            fw2 fw2Var = of0Var.completion;
            fw2Var.getClass();
            try {
                obj = of0Var.invokeSuspend(obj);
                if (obj == bx2.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new sa9(th);
            }
            of0Var.releaseIntercepted();
            if (fw2Var instanceof of0) {
                this = fw2Var;
            } else {
                fw2Var.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public fw2 create(Object obj, fw2 fw2Var) {
        fw2Var.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
