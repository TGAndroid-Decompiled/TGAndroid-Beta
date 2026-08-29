package o2;

import i7.f0;
import java.lang.reflect.InvocationTargetException;
import nh.d6;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
public abstract class l {
    public static final n f19066a;

    static {
        d6 d6Var;
        try {
            d6Var = new d6((WebViewProviderFactoryBoundaryInterface) ce.b.a(WebViewProviderFactoryBoundaryInterface.class, f0.a()), 2);
        } catch (ClassNotFoundException unused) {
            d6Var = new Object();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
        f19066a = d6Var;
    }
}
