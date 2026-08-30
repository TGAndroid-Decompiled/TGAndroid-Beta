package o2;

import java.lang.reflect.InvocationTargetException;
import k7.h0;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
public abstract class l {
    public static final n f16217a;

    static {
        o oVar;
        try {
            oVar = new o((WebViewProviderFactoryBoundaryInterface) ee.b.a(WebViewProviderFactoryBoundaryInterface.class, h0.a()), 0);
        } catch (ClassNotFoundException unused) {
            oVar = new Object();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        f16217a = oVar;
    }
}
