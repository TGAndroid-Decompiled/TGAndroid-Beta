package b5;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import v7.e0;
public abstract class n {
    public static final p f2595a;

    static {
        ya.c cVar;
        try {
            cVar = new ya.c((WebViewProviderFactoryBoundaryInterface) androidx.activity.result.c.a(WebViewProviderFactoryBoundaryInterface.class, e0.a()), 7);
        } catch (ClassNotFoundException unused) {
            cVar = new Object();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        f2595a = cVar;
    }
}
