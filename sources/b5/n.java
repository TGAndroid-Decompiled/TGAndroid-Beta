package b5;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import v7.e0;
public abstract class n {
    public static final p f4208a;

    static {
        a6.i iVar;
        try {
            iVar = new a6.i((WebViewProviderFactoryBoundaryInterface) androidx.activity.result.c.a(WebViewProviderFactoryBoundaryInterface.class, e0.a()), 8);
        } catch (ClassNotFoundException unused) {
            iVar = new Object();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        f4208a = iVar;
    }
}
