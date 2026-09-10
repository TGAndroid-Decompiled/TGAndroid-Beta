package k5;
public final class h extends a {
    public final Integer f12313a;
    public final String f12314b;
    public final String f12315c;
    public final String d;
    public final String e;
    public final String f12316f;
    public final String f12317g;
    public final String h;
    public final String f12318i;
    public final String f12319j;
    public final String f12320k;
    public final String f12321l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f12313a = num;
        this.f12314b = str;
        this.f12315c = str2;
        this.d = str3;
        this.e = str4;
        this.f12316f = str5;
        this.f12317g = str6;
        this.h = str7;
        this.f12318i = str8;
        this.f12319j = str9;
        this.f12320k = str10;
        this.f12321l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f12313a;
            if (num != null ? num.equals(((h) aVar).f12313a) : ((h) aVar).f12313a == null) {
                String str = this.f12314b;
                if (str != null ? str.equals(((h) aVar).f12314b) : ((h) aVar).f12314b == null) {
                    String str2 = this.f12315c;
                    if (str2 != null ? str2.equals(((h) aVar).f12315c) : ((h) aVar).f12315c == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(((h) aVar).d) : ((h) aVar).d == null) {
                            String str4 = this.e;
                            if (str4 != null ? str4.equals(((h) aVar).e) : ((h) aVar).e == null) {
                                String str5 = this.f12316f;
                                if (str5 != null ? str5.equals(((h) aVar).f12316f) : ((h) aVar).f12316f == null) {
                                    String str6 = this.f12317g;
                                    if (str6 != null ? str6.equals(((h) aVar).f12317g) : ((h) aVar).f12317g == null) {
                                        String str7 = this.h;
                                        if (str7 != null ? str7.equals(((h) aVar).h) : ((h) aVar).h == null) {
                                            String str8 = this.f12318i;
                                            if (str8 != null ? str8.equals(((h) aVar).f12318i) : ((h) aVar).f12318i == null) {
                                                String str9 = this.f12319j;
                                                if (str9 != null ? str9.equals(((h) aVar).f12319j) : ((h) aVar).f12319j == null) {
                                                    String str10 = this.f12320k;
                                                    if (str10 != null ? str10.equals(((h) aVar).f12320k) : ((h) aVar).f12320k == null) {
                                                        String str11 = this.f12321l;
                                                        if (str11 != null ? str11.equals(((h) aVar).f12321l) : ((h) aVar).f12321l == null) {
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
        int i10 = 0;
        Integer num = this.f12313a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        String str = this.f12314b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str2 = this.f12315c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        String str4 = this.e;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i15 = (i14 ^ hashCode5) * 1000003;
        String str5 = this.f12316f;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i16 = (i15 ^ hashCode6) * 1000003;
        String str6 = this.f12317g;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i17 = (i16 ^ hashCode7) * 1000003;
        String str7 = this.h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i18 = (i17 ^ hashCode8) * 1000003;
        String str8 = this.f12318i;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i19 = (i18 ^ hashCode9) * 1000003;
        String str9 = this.f12319j;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i20 = (i19 ^ hashCode10) * 1000003;
        String str10 = this.f12320k;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i21 = (i20 ^ hashCode11) * 1000003;
        String str11 = this.f12321l;
        if (str11 != null) {
            i10 = str11.hashCode();
        }
        return i10 ^ i21;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f12313a);
        sb2.append(", model=");
        sb2.append(this.f12314b);
        sb2.append(", hardware=");
        sb2.append(this.f12315c);
        sb2.append(", device=");
        sb2.append(this.d);
        sb2.append(", product=");
        sb2.append(this.e);
        sb2.append(", osBuild=");
        sb2.append(this.f12316f);
        sb2.append(", manufacturer=");
        sb2.append(this.f12317g);
        sb2.append(", fingerprint=");
        sb2.append(this.h);
        sb2.append(", locale=");
        sb2.append(this.f12318i);
        sb2.append(", country=");
        sb2.append(this.f12319j);
        sb2.append(", mccMnc=");
        sb2.append(this.f12320k);
        sb2.append(", applicationBuild=");
        return a4.a.s(sb2, this.f12321l, "}");
    }
}
