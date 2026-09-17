package b5;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import v7.h0;
public abstract class n {
    public static final p f2528a;

    static {
        xa.c cVar;
        try {
            cVar = new xa.c((WebViewProviderFactoryBoundaryInterface) se.b.a(WebViewProviderFactoryBoundaryInterface.class, h0.a()), 6);
        } catch (ClassNotFoundException unused) {
            cVar = new Object();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
        f2528a = cVar;
    }
}
