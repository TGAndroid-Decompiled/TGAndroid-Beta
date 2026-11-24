package defpackage;
public final class e5e {
    public static final e5e b = new e5e((byte) 0);
    public static final e5e c = new e5e((byte) 1);
    public static final e5e d = new e5e((byte) 2);
    public static final e5e e = new e5e((byte) 3);
    public static final e5e f = new e5e((byte) 4);
    public static final e5e g = new e5e((byte) 5);
    public static final e5e h = new e5e((byte) 6);
    public static final e5e i = new e5e((byte) 7);
    public final byte a;

    public e5e(byte b2) {
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
                                r4 = g3e.REASON_INVALID;
                            }
                        } else {
                            r4 = g3e.REASON_UPGRADE;
                        }
                    } else {
                        r4 = g3e.REASON_MISSING;
                    }
                } else {
                    r4 = g3e.REASON_UNKNOWN;
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
                                r4 = i3e.RESULT_SKIPPED;
                            }
                        } else {
                            r4 = i3e.RESULT_FAIL;
                        }
                    } else {
                        r4 = i3e.RESULT_SUCCESS;
                    }
                } else {
                    r4 = i3e.RESULT_UNKNOWN;
                }
                if (r4 == null) {
                    return false;
                }
                return true;
            case 2:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            r4 = l3e.CLASSIFICATION_ALL;
                        }
                    } else {
                        r4 = l3e.CLASSIFICATION_NONE;
                    }
                } else {
                    r4 = l3e.CLASSIFICATION_UNKNOWN;
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
                                r4 = m3e.LANDMARK_CONTOUR;
                            }
                        } else {
                            r4 = m3e.LANDMARK_ALL;
                        }
                    } else {
                        r4 = m3e.LANDMARK_NONE;
                    }
                } else {
                    r4 = m3e.LANDMARK_UNKNOWN;
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
                                r4 = n3e.MODE_SELFIE;
                            }
                        } else {
                            r4 = n3e.MODE_FAST;
                        }
                    } else {
                        r4 = n3e.MODE_ACCURATE;
                    }
                } else {
                    r4 = n3e.MODE_UNKNOWN;
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
                                r4 = s3e.FORMAT_MONOCHROME;
                            }
                        } else {
                            r4 = s3e.FORMAT_RGB8;
                        }
                    } else {
                        r4 = s3e.FORMAT_LUMINANCE;
                    }
                } else {
                    r4 = s3e.FORMAT_UNKNOWN;
                }
                if (r4 == null) {
                    return false;
                }
                return true;
            case 6:
                switch (i2) {
                    case 0:
                        r4 = bee.UNRECOGNIZED;
                        break;
                    case 1:
                        r4 = bee.CODE_128;
                        break;
                    case 2:
                        r4 = bee.CODE_39;
                        break;
                    case 3:
                        r4 = bee.CODE_93;
                        break;
                    case 4:
                        r4 = bee.CODABAR;
                        break;
                    case 5:
                        r4 = bee.DATA_MATRIX;
                        break;
                    case 6:
                        r4 = bee.EAN_13;
                        break;
                    case 7:
                        r4 = bee.EAN_8;
                        break;
                    case 8:
                        r4 = bee.ITF;
                        break;
                    case 9:
                        r4 = bee.QR_CODE;
                        break;
                    case 10:
                        r4 = bee.UPC_A;
                        break;
                    case 11:
                        r4 = bee.UPC_E;
                        break;
                    case 12:
                        r4 = bee.PDF417;
                        break;
                    case 13:
                        r4 = bee.AZTEC;
                        break;
                    case 14:
                        r4 = bee.DATABAR;
                        break;
                    case 16:
                        r4 = bee.TEZ_CODE;
                        break;
                }
                if (r4 == null) {
                    return false;
                }
                return true;
            default:
                switch (i2) {
                    case 0:
                        r4 = see.UNKNOWN_FORMAT;
                        break;
                    case 1:
                        r4 = see.CONTACT_INFO;
                        break;
                    case 2:
                        r4 = see.EMAIL;
                        break;
                    case 3:
                        r4 = see.ISBN;
                        break;
                    case 4:
                        r4 = see.PHONE;
                        break;
                    case 5:
                        r4 = see.PRODUCT;
                        break;
                    case 6:
                        r4 = see.SMS;
                        break;
                    case 7:
                        r4 = see.TEXT;
                        break;
                    case 8:
                        r4 = see.URL;
                        break;
                    case 9:
                        r4 = see.WIFI;
                        break;
                    case 10:
                        r4 = see.GEO;
                        break;
                    case 11:
                        r4 = see.CALENDAR_EVENT;
                        break;
                    case 12:
                        r4 = see.DRIVER_LICENSE;
                        break;
                    case 13:
                        r4 = see.BOARDING_PASS;
                        break;
                }
                if (r4 == null) {
                    return false;
                }
                return true;
        }
    }
}
