package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class qf0 implements zw2, wx2, Serializable {
    private final zw2 completion;

    public qf0(zw2 zw2Var) {
        this.completion = zw2Var;
    }

    public zw2 create(zw2 zw2Var) {
        zw2Var.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public wx2 getCallerFrame() {
        zw2 zw2Var = this.completion;
        if (zw2Var instanceof wx2) {
            return (wx2) zw2Var;
        }
        return null;
    }

    public final zw2 getCompletion() {
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
        g93 g93Var = (g93) getClass().getAnnotation(g93.class);
        String str2 = null;
        if (g93Var == null) {
            return null;
        }
        int v = g93Var.v();
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
                i3 = g93Var.l()[i];
            }
            yg7 yg7Var = mfd.b;
            yg7 yg7Var2 = mfd.a;
            if (yg7Var == null) {
                try {
                    yg7 yg7Var3 = new yg7(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    mfd.b = yg7Var3;
                    yg7Var = yg7Var3;
                } catch (Exception unused2) {
                    mfd.b = yg7Var2;
                    yg7Var = yg7Var2;
                }
            }
            if (yg7Var != yg7Var2 && (method = yg7Var.a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = yg7Var.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = yg7Var.c;
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
                str = g93Var.c();
            } else {
                str = str2 + '/' + g93Var.c();
            }
            return new StackTraceElement(str, g93Var.m(), g93Var.f(), i3);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
    }

    public Object invokeSuspend(Object obj) {
        ixe.b(obj);
        return f9c.a;
    }

    @Override
    public final void resumeWith(Object obj) {
        while (true) {
            qf0 qf0Var = this;
            zw2 zw2Var = qf0Var.completion;
            zw2Var.getClass();
            try {
                obj = qf0Var.invokeSuspend(obj);
                if (obj == vx2.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new ge9(th);
            }
            qf0Var.releaseIntercepted();
            if (zw2Var instanceof qf0) {
                this = zw2Var;
            } else {
                zw2Var.resumeWith(obj);
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

    public zw2 create(Object obj, zw2 zw2Var) {
        zw2Var.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
