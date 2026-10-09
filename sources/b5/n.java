package b5;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import v7.e0;
public abstract class n {
    public static final p f3774a;

    static {
        a6.i iVar;
        try {
            iVar = new a6.i((WebViewProviderFactoryBoundaryInterface) te.b.a(WebViewProviderFactoryBoundaryInterface.class, e0.a()), 7);
        } catch (ClassNotFoundException unused) {
            iVar = new Object();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
        f3774a = iVar;
    }
}
