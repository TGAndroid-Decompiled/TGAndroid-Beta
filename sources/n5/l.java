package n5;

import a8.p0;
public final class l extends a {
    public final Integer f21412a;
    public final String f21413b;
    public final String f21414c;
    public final String d;
    public final String f21415e;
    public final String f21416f;
    public final String f21417g;
    public final String h;
    public final String f21418i;
    public final String f21419j;
    public final String f21420k;
    public final String f21421l;

    public l(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f21412a = num;
        this.f21413b = str;
        this.f21414c = str2;
        this.d = str3;
        this.f21415e = str4;
        this.f21416f = str5;
        this.f21417g = str6;
        this.h = str7;
        this.f21418i = str8;
        this.f21419j = str9;
        this.f21420k = str10;
        this.f21421l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f21412a;
            if (num != null ? num.equals(((l) aVar).f21412a) : ((l) aVar).f21412a == null) {
                String str = this.f21413b;
                if (str != null ? str.equals(((l) aVar).f21413b) : ((l) aVar).f21413b == null) {
                    String str2 = this.f21414c;
                    if (str2 != null ? str2.equals(((l) aVar).f21414c) : ((l) aVar).f21414c == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(((l) aVar).d) : ((l) aVar).d == null) {
                            String str4 = this.f21415e;
                            if (str4 != null ? str4.equals(((l) aVar).f21415e) : ((l) aVar).f21415e == null) {
                                String str5 = this.f21416f;
                                if (str5 != null ? str5.equals(((l) aVar).f21416f) : ((l) aVar).f21416f == null) {
                                    String str6 = this.f21417g;
                                    if (str6 != null ? str6.equals(((l) aVar).f21417g) : ((l) aVar).f21417g == null) {
                                        String str7 = this.h;
                                        if (str7 != null ? str7.equals(((l) aVar).h) : ((l) aVar).h == null) {
                                            String str8 = this.f21418i;
                                            if (str8 != null ? str8.equals(((l) aVar).f21418i) : ((l) aVar).f21418i == null) {
                                                String str9 = this.f21419j;
                                                if (str9 != null ? str9.equals(((l) aVar).f21419j) : ((l) aVar).f21419j == null) {
                                                    String str10 = this.f21420k;
                                                    if (str10 != null ? str10.equals(((l) aVar).f21420k) : ((l) aVar).f21420k == null) {
                                                        String str11 = this.f21421l;
                                                        if (str11 != null ? str11.equals(((l) aVar).f21421l) : ((l) aVar).f21421l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int i7 = 0;
        Integer num = this.f21412a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        String str = this.f21413b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str2 = this.f21414c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        String str4 = this.f21415e;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i14 = (i13 ^ hashCode5) * 1000003;
        String str5 = this.f21416f;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i15 = (i14 ^ hashCode6) * 1000003;
        String str6 = this.f21417g;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i16 = (i15 ^ hashCode7) * 1000003;
        String str7 = this.h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i17 = (i16 ^ hashCode8) * 1000003;
        String str8 = this.f21418i;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i18 = (i17 ^ hashCode9) * 1000003;
        String str9 = this.f21419j;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i19 = (i18 ^ hashCode10) * 1000003;
        String str10 = this.f21420k;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i20 = (i19 ^ hashCode11) * 1000003;
        String str11 = this.f21421l;
        if (str11 != null) {
            i7 = str11.hashCode();
        }
        return i7 ^ i20;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f21412a);
        sb2.append(", model=");
        sb2.append(this.f21413b);
        sb2.append(", hardware=");
        sb2.append(this.f21414c);
        sb2.append(", device=");
        sb2.append(this.d);
        sb2.append(", product=");
        sb2.append(this.f21415e);
        sb2.append(", osBuild=");
        sb2.append(this.f21416f);
        sb2.append(", manufacturer=");
        sb2.append(this.f21417g);
        sb2.append(", fingerprint=");
        sb2.append(this.h);
        sb2.append(", locale=");
        sb2.append(this.f21418i);
        sb2.append(", country=");
        sb2.append(this.f21419j);
        sb2.append(", mccMnc=");
        sb2.append(this.f21420k);
        sb2.append(", applicationBuild=");
        return p0.s(sb2, this.f21421l, "}");
    }
}
