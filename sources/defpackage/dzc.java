package defpackage;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
public abstract class dzc {
    public static final fzc a;

    static {
        fzc rj2Var;
        try {
            rj2Var = new l09((WebViewProviderFactoryBoundaryInterface) py0.a(WebViewProviderFactoryBoundaryInterface.class, x2f.a()), (byte) 20);
        } catch (ClassNotFoundException unused) {
            rj2Var = new rj2((byte) 2);
        } catch (IllegalAccessException e) {
            e = e;
            grb.m(e);
            return;
        } catch (NoSuchMethodException e2) {
            e = e2;
            grb.m(e);
            return;
        } catch (InvocationTargetException e3) {
            e = e3;
            grb.m(e);
            return;
        }
        a = rj2Var;
    }
}
