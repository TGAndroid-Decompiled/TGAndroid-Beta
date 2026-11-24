package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class og0 implements px2, my2, Serializable {
    private final px2 completion;

    public og0(px2 px2Var) {
        this.completion = px2Var;
    }

    public px2 create(px2 px2Var) {
        px2Var.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override
    public my2 getCallerFrame() {
        px2 px2Var = this.completion;
        if (px2Var instanceof my2) {
            return (my2) px2Var;
        }
        return null;
    }

    public final px2 getCompletion() {
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
        z93 z93Var = (z93) getClass().getAnnotation(z93.class);
        String str2 = null;
        if (z93Var == null) {
            return null;
        }
        int v = z93Var.v();
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
                i3 = z93Var.l()[i];
            }
            rg7 rg7Var = vcd.b;
            rg7 rg7Var2 = vcd.a;
            if (rg7Var == null) {
                try {
                    rg7 rg7Var3 = new rg7(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    vcd.b = rg7Var3;
                    rg7Var = rg7Var3;
                } catch (Exception unused2) {
                    vcd.b = rg7Var2;
                    rg7Var = rg7Var2;
                }
            }
            if (rg7Var != rg7Var2 && (method = rg7Var.a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = rg7Var.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = rg7Var.c;
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
                str = z93Var.c();
            } else {
                str = str2 + '/' + z93Var.c();
            }
            return new StackTraceElement(str, z93Var.m(), z93Var.f(), i3);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
    }

    public Object invokeSuspend(Object obj) {
        tue.b(obj);
        return g7c.a;
    }

    @Override
    public final void resumeWith(Object obj) {
        while (true) {
            og0 og0Var = this;
            px2 px2Var = og0Var.completion;
            px2Var.getClass();
            try {
                obj = og0Var.invokeSuspend(obj);
                if (obj == ly2.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new sc9(th);
            }
            og0Var.releaseIntercepted();
            if (px2Var instanceof og0) {
                this = px2Var;
            } else {
                px2Var.resumeWith(obj);
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

    public px2 create(Object obj, px2 px2Var) {
        px2Var.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
