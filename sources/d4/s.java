package d4;

import h5.d0;
public final class s implements x {
    public static final s f4272b = new s(0);
    public final int f4273a;

    public s(int i10) {
        this.f4273a = i10;
    }

    @Override
    public int b(Object obj) {
        n nVar = (n) obj;
        switch (this.f4273a) {
            case 2:
                String str = nVar.f4235a;
                if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
                    if (d0.f7237a < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        return -1;
                    }
                    return 0;
                }
                return 1;
            default:
                return nVar.f4235a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
