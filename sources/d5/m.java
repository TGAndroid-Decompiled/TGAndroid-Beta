package d5;

import b8.fb;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
public abstract class m {
    public static final o f8582a;

    static {
        c6.i iVar;
        try {
            iVar = new c6.i((WebViewProviderFactoryBoundaryInterface) xe.b.a(WebViewProviderFactoryBoundaryInterface.class, fb.a()), 15);
        } catch (ClassNotFoundException unused) {
            iVar = new Object();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
        f8582a = iVar;
    }
}
