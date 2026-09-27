package b5;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import v7.i0;
public abstract class n {
    public static final p f3421a;

    static {
        a6.i iVar;
        try {
            iVar = new a6.i((WebViewProviderFactoryBoundaryInterface) se.b.a(WebViewProviderFactoryBoundaryInterface.class, i0.a()), 7);
        } catch (ClassNotFoundException unused) {
            iVar = new Object();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        f3421a = iVar;
    }
}
