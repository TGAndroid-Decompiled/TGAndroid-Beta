package e5;

import a8.aa;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
public abstract class l {
    public static final n f10860a;

    static {
        cb.c cVar;
        try {
            cVar = new cb.c((WebViewProviderFactoryBoundaryInterface) af.b.a(WebViewProviderFactoryBoundaryInterface.class, aa.a()), 18);
        } catch (ClassNotFoundException unused) {
            cVar = new Object();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
        f10860a = cVar;
    }
}
