package defpackage;

import android.content.Context;
public final class dj0 {
    public Context a;

    public dj0(Context context) {
        this.a = context.getApplicationContext();
    }

    public final c53 a() {
        Context context = this.a;
        if (context != null) {
            ?? obj = new Object();
            obj.a = zo3.a(h9d.a);
            pj4 pj4Var = new pj4(context, (byte) 8);
            obj.b = pj4Var;
            obj.c = zo3.a(new wk4(pj4Var, new i13(pj4Var, (byte) 0), (byte) 11));
            pj4 pj4Var2 = obj.b;
            obj.d = new g29(pj4Var2, (byte) 7);
            lt8 a = zo3.a(new sk4(obj.d, zo3.a(new i13(pj4Var2, (byte) 1)), (byte) 21));
            obj.e = a;
            i2f i2fVar = new i2f((byte) 25);
            pj4 pj4Var3 = obj.b;
            vk9 vk9Var = new vk9(pj4Var3, a, i2fVar, (byte) 2);
            lt8 lt8Var = obj.a;
            lt8 lt8Var2 = obj.c;
            gl2 gl2Var = new gl2(lt8Var, lt8Var2, vk9Var, a, a, (byte) 5);
            ?? obj2 = new Object();
            obj2.a = pj4Var3;
            obj2.b = lt8Var2;
            obj2.c = a;
            obj2.d = vk9Var;
            obj2.e = lt8Var;
            obj2.f = a;
            obj2.h = a;
            obj.f = zo3.a(new vk9(gl2Var, (Object) obj2, new c5a(lt8Var, a, vk9Var, a, (byte) 19), (byte) 9));
            return obj;
        }
        String canonicalName = Context.class.getCanonicalName();
        throw new IllegalStateException(canonicalName + " must be set");
    }
}
