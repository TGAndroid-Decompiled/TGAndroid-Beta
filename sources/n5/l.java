package n5;

import a8.p0;
public final class l extends a {
    public final Integer f20456a;
    public final String f20457b;
    public final String f20458c;
    public final String d;
    public final String f20459e;
    public final String f20460f;
    public final String f20461g;
    public final String h;
    public final String f20462i;
    public final String f20463j;
    public final String f20464k;
    public final String f20465l;

    public l(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f20456a = num;
        this.f20457b = str;
        this.f20458c = str2;
        this.d = str3;
        this.f20459e = str4;
        this.f20460f = str5;
        this.f20461g = str6;
        this.h = str7;
        this.f20462i = str8;
        this.f20463j = str9;
        this.f20464k = str10;
        this.f20465l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f20456a;
            if (num != null ? num.equals(((l) aVar).f20456a) : ((l) aVar).f20456a == null) {
                String str = this.f20457b;
                if (str != null ? str.equals(((l) aVar).f20457b) : ((l) aVar).f20457b == null) {
                    String str2 = this.f20458c;
                    if (str2 != null ? str2.equals(((l) aVar).f20458c) : ((l) aVar).f20458c == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(((l) aVar).d) : ((l) aVar).d == null) {
                            String str4 = this.f20459e;
                            if (str4 != null ? str4.equals(((l) aVar).f20459e) : ((l) aVar).f20459e == null) {
                                String str5 = this.f20460f;
                                if (str5 != null ? str5.equals(((l) aVar).f20460f) : ((l) aVar).f20460f == null) {
                                    String str6 = this.f20461g;
                                    if (str6 != null ? str6.equals(((l) aVar).f20461g) : ((l) aVar).f20461g == null) {
                                        String str7 = this.h;
                                        if (str7 != null ? str7.equals(((l) aVar).h) : ((l) aVar).h == null) {
                                            String str8 = this.f20462i;
                                            if (str8 != null ? str8.equals(((l) aVar).f20462i) : ((l) aVar).f20462i == null) {
                                                String str9 = this.f20463j;
                                                if (str9 != null ? str9.equals(((l) aVar).f20463j) : ((l) aVar).f20463j == null) {
                                                    String str10 = this.f20464k;
                                                    if (str10 != null ? str10.equals(((l) aVar).f20464k) : ((l) aVar).f20464k == null) {
                                                        String str11 = this.f20465l;
                                                        if (str11 != null ? str11.equals(((l) aVar).f20465l) : ((l) aVar).f20465l == null) {
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
        Integer num = this.f20456a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        String str = this.f20457b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str2 = this.f20458c;
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
        String str4 = this.f20459e;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i14 = (i13 ^ hashCode5) * 1000003;
        String str5 = this.f20460f;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i15 = (i14 ^ hashCode6) * 1000003;
        String str6 = this.f20461g;
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
        String str8 = this.f20462i;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i18 = (i17 ^ hashCode9) * 1000003;
        String str9 = this.f20463j;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i19 = (i18 ^ hashCode10) * 1000003;
        String str10 = this.f20464k;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i20 = (i19 ^ hashCode11) * 1000003;
        String str11 = this.f20465l;
        if (str11 != null) {
            i7 = str11.hashCode();
        }
        return i7 ^ i20;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f20456a);
        sb2.append(", model=");
        sb2.append(this.f20457b);
        sb2.append(", hardware=");
        sb2.append(this.f20458c);
        sb2.append(", device=");
        sb2.append(this.d);
        sb2.append(", product=");
        sb2.append(this.f20459e);
        sb2.append(", osBuild=");
        sb2.append(this.f20460f);
        sb2.append(", manufacturer=");
        sb2.append(this.f20461g);
        sb2.append(", fingerprint=");
        sb2.append(this.h);
        sb2.append(", locale=");
        sb2.append(this.f20462i);
        sb2.append(", country=");
        sb2.append(this.f20463j);
        sb2.append(", mccMnc=");
        sb2.append(this.f20464k);
        sb2.append(", applicationBuild=");
        return p0.s(sb2, this.f20465l, "}");
    }
}
