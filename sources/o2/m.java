package o2;

import androidx.biometric.e0;
import java.lang.reflect.InvocationTargetException;
import k7.h0;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
public abstract class m {
    public static final o f16199a;

    static {
        e0 e0Var;
        try {
            e0Var = new e0((WebViewProviderFactoryBoundaryInterface) ee.b.a(WebViewProviderFactoryBoundaryInterface.class, h0.a()), 23);
        } catch (ClassNotFoundException unused) {
            e0Var = new Object();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        f16199a = e0Var;
    }
}
