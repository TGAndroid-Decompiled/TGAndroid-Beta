package a4;

import f5.d0;
public final class u implements a0 {
    public static final u f149b = new u(0);
    public final int f150a;

    public u(int i10) {
        this.f150a = i10;
    }

    @Override
    public int b(Object obj) {
        q qVar = (q) obj;
        switch (this.f150a) {
            case 2:
                String str = qVar.f104a;
                if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
                    if (d0.f6579a < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        return -1;
                    }
                    return 0;
                }
                return 1;
            default:
                return qVar.f104a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
