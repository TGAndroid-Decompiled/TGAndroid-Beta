package defpackage;
public final class b3e {
    public static final b3e b = new b3e((byte) 0);
    public static final b3e c = new b3e((byte) 1);
    public static final b3e d = new b3e((byte) 2);
    public static final b3e e = new b3e((byte) 3);
    public static final b3e f = new b3e((byte) 4);
    public static final b3e g = new b3e((byte) 5);
    public static final b3e h = new b3e((byte) 6);
    public static final b3e i = new b3e((byte) 7);
    public final byte a;

    public b3e(byte b2) {
        this.a = b2;
    }

    public final boolean a(int i2) {
        Enum r4 = null;
        switch (this.a) {
            case 0:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                r4 = d1e.REASON_INVALID;
                            }
                        } else {
                            r4 = d1e.REASON_UPGRADE;
                        }
                    } else {
                        r4 = d1e.REASON_MISSING;
                    }
                } else {
                    r4 = d1e.REASON_UNKNOWN;
                }
                if (r4 == null) {
                    return false;
                }
                return true;
            case 1:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                r4 = f1e.RESULT_SKIPPED;
                            }
                        } else {
                            r4 = f1e.RESULT_FAIL;
                        }
                    } else {
                        r4 = f1e.RESULT_SUCCESS;
                    }
                } else {
                    r4 = f1e.RESULT_UNKNOWN;
                }
                if (r4 == null) {
                    return false;
                }
                return true;
            case 2:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            r4 = i1e.CLASSIFICATION_ALL;
                        }
                    } else {
                        r4 = i1e.CLASSIFICATION_NONE;
                    }
                } else {
                    r4 = i1e.CLASSIFICATION_UNKNOWN;
                }
                if (r4 == null) {
                    return false;
                }
                return true;
            case 3:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                r4 = j1e.LANDMARK_CONTOUR;
                            }
                        } else {
                            r4 = j1e.LANDMARK_ALL;
                        }
                    } else {
                        r4 = j1e.LANDMARK_NONE;
                    }
                } else {
                    r4 = j1e.LANDMARK_UNKNOWN;
                }
                if (r4 == null) {
                    return false;
                }
                return true;
            case 4:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                r4 = k1e.MODE_SELFIE;
                            }
                        } else {
                            r4 = k1e.MODE_FAST;
                        }
                    } else {
                        r4 = k1e.MODE_ACCURATE;
                    }
                } else {
                    r4 = k1e.MODE_UNKNOWN;
                }
                if (r4 == null) {
                    return false;
                }
                return true;
            case 5:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                r4 = p1e.FORMAT_MONOCHROME;
                            }
                        } else {
                            r4 = p1e.FORMAT_RGB8;
                        }
                    } else {
                        r4 = p1e.FORMAT_LUMINANCE;
                    }
                } else {
                    r4 = p1e.FORMAT_UNKNOWN;
                }
                if (r4 == null) {
                    return false;
                }
                return true;
            case 6:
                switch (i2) {
                    case 0:
                        r4 = ace.UNRECOGNIZED;
                        break;
                    case 1:
                        r4 = ace.CODE_128;
                        break;
                    case 2:
                        r4 = ace.CODE_39;
                        break;
                    case 3:
                        r4 = ace.CODE_93;
                        break;
                    case 4:
                        r4 = ace.CODABAR;
                        break;
                    case 5:
                        r4 = ace.DATA_MATRIX;
                        break;
                    case 6:
                        r4 = ace.EAN_13;
                        break;
                    case 7:
                        r4 = ace.EAN_8;
                        break;
                    case 8:
                        r4 = ace.ITF;
                        break;
                    case 9:
                        r4 = ace.QR_CODE;
                        break;
                    case 10:
                        r4 = ace.UPC_A;
                        break;
                    case 11:
                        r4 = ace.UPC_E;
                        break;
                    case 12:
                        r4 = ace.PDF417;
                        break;
                    case 13:
                        r4 = ace.AZTEC;
                        break;
                    case 14:
                        r4 = ace.DATABAR;
                        break;
                    case 16:
                        r4 = ace.TEZ_CODE;
                        break;
                }
                if (r4 == null) {
                    return false;
                }
                return true;
            default:
                switch (i2) {
                    case 0:
                        r4 = rce.UNKNOWN_FORMAT;
                        break;
                    case 1:
                        r4 = rce.CONTACT_INFO;
                        break;
                    case 2:
                        r4 = rce.EMAIL;
                        break;
                    case 3:
                        r4 = rce.ISBN;
                        break;
                    case 4:
                        r4 = rce.PHONE;
                        break;
                    case 5:
                        r4 = rce.PRODUCT;
                        break;
                    case 6:
                        r4 = rce.SMS;
                        break;
                    case 7:
                        r4 = rce.TEXT;
                        break;
                    case 8:
                        r4 = rce.URL;
                        break;
                    case 9:
                        r4 = rce.WIFI;
                        break;
                    case 10:
                        r4 = rce.GEO;
                        break;
                    case 11:
                        r4 = rce.CALENDAR_EVENT;
                        break;
                    case 12:
                        r4 = rce.DRIVER_LICENSE;
                        break;
                    case 13:
                        r4 = rce.BOARDING_PASS;
                        break;
                }
                if (r4 == null) {
                    return false;
                }
                return true;
        }
    }
}
