package defpackage;
public final class r7e {
    public static final r7e b = new r7e((byte) 0);
    public static final r7e c = new r7e((byte) 1);
    public static final r7e d = new r7e((byte) 2);
    public static final r7e e = new r7e((byte) 3);
    public static final r7e f = new r7e((byte) 4);
    public static final r7e g = new r7e((byte) 5);
    public static final r7e h = new r7e((byte) 6);
    public static final r7e i = new r7e((byte) 7);
    public final byte a;

    public r7e(byte b2) {
        this.a = b2;
    }

    public final boolean a(int i2) {
        sse sseVar = null;
        switch (this.a) {
            case 0:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                sseVar = t5e.REASON_INVALID;
                            }
                        } else {
                            sseVar = t5e.REASON_UPGRADE;
                        }
                    } else {
                        sseVar = t5e.REASON_MISSING;
                    }
                } else {
                    sseVar = t5e.REASON_UNKNOWN;
                }
                if (sseVar == null) {
                    return false;
                }
                return true;
            case 1:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                sseVar = v5e.RESULT_SKIPPED;
                            }
                        } else {
                            sseVar = v5e.RESULT_FAIL;
                        }
                    } else {
                        sseVar = v5e.RESULT_SUCCESS;
                    }
                } else {
                    sseVar = v5e.RESULT_UNKNOWN;
                }
                if (sseVar == null) {
                    return false;
                }
                return true;
            case 2:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            sseVar = y5e.CLASSIFICATION_ALL;
                        }
                    } else {
                        sseVar = y5e.CLASSIFICATION_NONE;
                    }
                } else {
                    sseVar = y5e.CLASSIFICATION_UNKNOWN;
                }
                if (sseVar == null) {
                    return false;
                }
                return true;
            case 3:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                sseVar = z5e.LANDMARK_CONTOUR;
                            }
                        } else {
                            sseVar = z5e.LANDMARK_ALL;
                        }
                    } else {
                        sseVar = z5e.LANDMARK_NONE;
                    }
                } else {
                    sseVar = z5e.LANDMARK_UNKNOWN;
                }
                if (sseVar == null) {
                    return false;
                }
                return true;
            case 4:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                sseVar = a6e.MODE_SELFIE;
                            }
                        } else {
                            sseVar = a6e.MODE_FAST;
                        }
                    } else {
                        sseVar = a6e.MODE_ACCURATE;
                    }
                } else {
                    sseVar = a6e.MODE_UNKNOWN;
                }
                if (sseVar == null) {
                    return false;
                }
                return true;
            case 5:
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                sseVar = f6e.FORMAT_MONOCHROME;
                            }
                        } else {
                            sseVar = f6e.FORMAT_RGB8;
                        }
                    } else {
                        sseVar = f6e.FORMAT_LUMINANCE;
                    }
                } else {
                    sseVar = f6e.FORMAT_UNKNOWN;
                }
                if (sseVar == null) {
                    return false;
                }
                return true;
            case 6:
                switch (i2) {
                    case 0:
                        sseVar = qge.UNRECOGNIZED;
                        break;
                    case 1:
                        sseVar = qge.CODE_128;
                        break;
                    case 2:
                        sseVar = qge.CODE_39;
                        break;
                    case 3:
                        sseVar = qge.CODE_93;
                        break;
                    case 4:
                        sseVar = qge.CODABAR;
                        break;
                    case 5:
                        sseVar = qge.DATA_MATRIX;
                        break;
                    case 6:
                        sseVar = qge.EAN_13;
                        break;
                    case 7:
                        sseVar = qge.EAN_8;
                        break;
                    case 8:
                        sseVar = qge.ITF;
                        break;
                    case 9:
                        sseVar = qge.QR_CODE;
                        break;
                    case 10:
                        sseVar = qge.UPC_A;
                        break;
                    case 11:
                        sseVar = qge.UPC_E;
                        break;
                    case 12:
                        sseVar = qge.PDF417;
                        break;
                    case 13:
                        sseVar = qge.AZTEC;
                        break;
                    case 14:
                        sseVar = qge.DATABAR;
                        break;
                    case 16:
                        sseVar = qge.TEZ_CODE;
                        break;
                }
                if (sseVar == null) {
                    return false;
                }
                return true;
            default:
                switch (i2) {
                    case 0:
                        sseVar = ihe.UNKNOWN_FORMAT;
                        break;
                    case 1:
                        sseVar = ihe.CONTACT_INFO;
                        break;
                    case 2:
                        sseVar = ihe.EMAIL;
                        break;
                    case 3:
                        sseVar = ihe.ISBN;
                        break;
                    case 4:
                        sseVar = ihe.PHONE;
                        break;
                    case 5:
                        sseVar = ihe.PRODUCT;
                        break;
                    case 6:
                        sseVar = ihe.SMS;
                        break;
                    case 7:
                        sseVar = ihe.TEXT;
                        break;
                    case 8:
                        sseVar = ihe.URL;
                        break;
                    case 9:
                        sseVar = ihe.WIFI;
                        break;
                    case 10:
                        sseVar = ihe.GEO;
                        break;
                    case 11:
                        sseVar = ihe.CALENDAR_EVENT;
                        break;
                    case 12:
                        sseVar = ihe.DRIVER_LICENSE;
                        break;
                    case 13:
                        sseVar = ihe.BOARDING_PASS;
                        break;
                }
                if (sseVar == null) {
                    return false;
                }
                return true;
        }
    }
}
