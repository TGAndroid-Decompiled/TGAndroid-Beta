package k7;
public abstract class u6 {
    public static boolean a(h5.w r19, r3.o r20, int r21, org.telegram.ui.Components.jb r22) {
        throw new UnsupportedOperationException("Method not decompiled: k7.u6.a(h5.w, r3.o, int, org.telegram.ui.Components.jb):boolean");
    }

    public static int b(int i10, h5.w wVar) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return wVar.u() + 1;
            case 7:
                return wVar.z() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
