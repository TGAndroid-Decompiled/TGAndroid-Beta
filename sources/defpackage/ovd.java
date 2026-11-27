package defpackage;
public final class ovd {
    public static final ovd b = new ovd((byte) 0);
    public static final ovd c = new ovd((byte) 1);
    public static final ovd d = new ovd((byte) 2);
    public static final ovd e = new ovd((byte) 3);
    public static final ovd f = new ovd((byte) 4);
    public static final ovd g = new ovd((byte) 5);
    public static final ovd h = new ovd((byte) 6);
    public static final ovd i = new ovd((byte) 7);
    public final byte a;

    public ovd(byte b2) {
        this.a = b2;
    }

    public final boolean a(int i2) {
        uoe uoeVar;
        switch (this.a) {
            case 0:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 1:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    default:
                        switch (i2) {
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                                break;
                            default:
                                return false;
                        }
                }
                return true;
            case 2:
                if (xnb.d(i2) == 0) {
                    return false;
                }
                return true;
            case 3:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                uoeVar = null;
                            } else {
                                uoeVar = uoe.ALTERNATIVE_BILLING_ACTION;
                            }
                        } else {
                            uoeVar = uoe.LOCAL_PURCHASES_UPDATED_ACTION;
                        }
                    } else {
                        uoeVar = uoe.PURCHASES_UPDATED_ACTION;
                    }
                } else {
                    uoeVar = uoe.BROADCAST_ACTION_UNSPECIFIED;
                }
                if (uoeVar == null) {
                    return false;
                }
                return true;
            case 4:
                if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
                    return false;
                }
                return true;
            case 5:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        return true;
                    case 14:
                    case 15:
                    case 16:
                    default:
                        return false;
                }
            case 6:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            default:
                if (i2 != 0 && i2 != 1) {
                    return false;
                }
                return true;
        }
    }
}
