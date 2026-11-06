package e5;

import a8.w9;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
public abstract class l {
    public static final n f10714a;

    static {
        d6.i iVar;
        try {
            iVar = new d6.i((WebViewProviderFactoryBoundaryInterface) af.b.a(WebViewProviderFactoryBoundaryInterface.class, w9.a()), 20);
        } catch (ClassNotFoundException unused) {
            iVar = new Object();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
        f10714a = iVar;
    }
}
