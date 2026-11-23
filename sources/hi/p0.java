package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
public final class p0 implements Runnable {
    public final int f15164a;
    public final u0 f15165b;
    public final File f15166c;

    public p0(u0 u0Var, File file, int i7) {
        this.f15164a = i7;
        this.f15165b = u0Var;
        this.f15166c = file;
    }

    @Override
    public final void run() {
        switch (this.f15164a) {
            case 0:
                u0 u0Var = this.f15165b;
                if (u0Var.f15480c && u0Var.f15484r != null) {
                    MediaController.d0(this.f15166c.getAbsolutePath(), u0Var.getContext(), 1, null, null, new q0(u0Var, 1));
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f15165b;
                d7 d7Var = u0Var2.f15484r;
                File file = this.f15166c;
                d7Var.c(file);
                if (u0Var2.f15480c && u0Var2.f15484r != null) {
                    org.telegram.messenger.g0.g3(new p0(u0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f15166c.getAbsolutePath();
                u0 u0Var3 = this.f15165b;
                MediaController.d0(absolutePath, u0Var3.getContext(), 0, null, null, new q0(u0Var3, 2));
                return;
        }
    }
}
