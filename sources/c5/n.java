package c5;

import a8.x9;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
public abstract class n {
    public static final p f6151a;

    static {
        a4.l lVar;
        try {
            lVar = new a4.l((WebViewProviderFactoryBoundaryInterface) ve.b.a(WebViewProviderFactoryBoundaryInterface.class, x9.a()), 8);
        } catch (ClassNotFoundException unused) {
            lVar = new Object();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        f6151a = lVar;
    }
}
