package e5;

import a8.z9;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
public abstract class l {
    public static final n f10894a;

    static {
        cb.c cVar;
        try {
            cVar = new cb.c((WebViewProviderFactoryBoundaryInterface) af.b.b(WebViewProviderFactoryBoundaryInterface.class, z9.a()), 18);
        } catch (ClassNotFoundException unused) {
            cVar = new Object();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
        f10894a = cVar;
    }
}
