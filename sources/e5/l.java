package e5;

import a8.y9;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
public abstract class l {
    public static final n f10550a;

    static {
        ob.c cVar;
        try {
            cVar = new ob.c((WebViewProviderFactoryBoundaryInterface) af.b.a(WebViewProviderFactoryBoundaryInterface.class, y9.a()), 17);
        } catch (ClassNotFoundException unused) {
            cVar = new Object();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
        f10550a = cVar;
    }
}
