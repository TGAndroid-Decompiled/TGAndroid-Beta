package o2;

import androidx.biometric.f0;
import java.lang.reflect.InvocationTargetException;
import k7.i0;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
public abstract class l {
    public static final n f16357a;

    static {
        f0 f0Var;
        try {
            f0Var = new f0((WebViewProviderFactoryBoundaryInterface) ee.b.a(WebViewProviderFactoryBoundaryInterface.class, i0.a()), 21);
        } catch (ClassNotFoundException unused) {
            f0Var = new Object();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
        f16357a = f0Var;
    }
}
