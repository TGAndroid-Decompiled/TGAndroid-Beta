package b5;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import v7.h0;
public abstract class n {
    public static final p f2120a;

    static {
        a4.m mVar;
        try {
            mVar = new a4.m((WebViewProviderFactoryBoundaryInterface) se.b.a(WebViewProviderFactoryBoundaryInterface.class, h0.a()), 3);
        } catch (ClassNotFoundException unused) {
            mVar = new Object();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        f2120a = mVar;
    }
}
