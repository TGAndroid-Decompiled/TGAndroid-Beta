package defpackage;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcelable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class n78 implements DialogInterface.OnClickListener {
    public final r78 a;

    public n78(r78 r78Var) {
        this.a = r78Var;
    }

    public static void a(String str, ContentValues contentValues) {
        if (str.startsWith("X-")) {
            contentValues.put("data2", (Integer) 0);
            contentValues.put("data3", str.substring(2));
        } else if ("PREF".equalsIgnoreCase(str)) {
            contentValues.put("data2", (Integer) 12);
        } else if ("HOME".equalsIgnoreCase(str)) {
            contentValues.put("data2", (Integer) 1);
        } else if (!"MOBILE".equalsIgnoreCase(str) && !"CELL".equalsIgnoreCase(str)) {
            if ("OTHER".equalsIgnoreCase(str)) {
                contentValues.put("data2", (Integer) 7);
            } else if ("WORK".equalsIgnoreCase(str)) {
                contentValues.put("data2", (Integer) 3);
            } else if (!"RADIO".equalsIgnoreCase(str) && !"VOICE".equalsIgnoreCase(str)) {
                if ("PAGER".equalsIgnoreCase(str)) {
                    contentValues.put("data2", (Integer) 6);
                } else if ("CALLBACK".equalsIgnoreCase(str)) {
                    contentValues.put("data2", (Integer) 8);
                } else if ("CAR".equalsIgnoreCase(str)) {
                    contentValues.put("data2", (Integer) 9);
                } else if ("ASSISTANT".equalsIgnoreCase(str)) {
                    contentValues.put("data2", (Integer) 19);
                } else if ("MMS".equalsIgnoreCase(str)) {
                    contentValues.put("data2", (Integer) 20);
                } else if (str.startsWith("FAX")) {
                    contentValues.put("data2", (Integer) 4);
                } else {
                    contentValues.put("data2", (Integer) 0);
                    contentValues.put("data3", str);
                }
            } else {
                contentValues.put("data2", (Integer) 14);
            }
        } else {
            contentValues.put("data2", (Integer) 2);
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent;
        String str;
        r78 r78Var;
        String str2;
        Intent intent2;
        Integer num;
        ArrayList<? extends Parcelable> arrayList;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        String str3;
        String str4;
        ArrayList arrayList2;
        boolean z;
        Integer num6;
        String str5;
        Integer num7;
        Integer num8;
        Integer num9 = 7;
        Integer num10 = 5;
        Integer num11 = 4;
        Integer num12 = 6;
        r78 r78Var2 = this.a;
        ArrayList arrayList3 = r78Var2.G1;
        ArrayList arrayList4 = r78Var2.F1;
        Integer num13 = 0;
        if (i == 0) {
            intent = new Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.dir/raw_contact");
        } else if (i == 1) {
            intent = new Intent("android.intent.action.INSERT_OR_EDIT");
            intent.setType("vnd.android.cursor.item/contact");
        } else {
            intent = null;
        }
        TLRPC.TL_userContact_old2 tL_userContact_old2 = r78Var2.H1;
        intent.putExtra("name", lv2.m(0, tL_userContact_old2.first_name, tL_userContact_old2.last_name));
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        int i2 = 0;
        while (true) {
            str = "data1";
            r78Var = r78Var2;
            str2 = "mimetype";
            if (i2 >= arrayList3.size()) {
                break;
            }
            gl glVar = (gl) arrayList3.get(i2);
            int i3 = i2;
            ContentValues contentValues = new ContentValues();
            contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
            contentValues.put("data1", glVar.c(false));
            a(glVar.a(false), contentValues);
            arrayList5.add(contentValues);
            i2 = i3 + 1;
            r78Var2 = r78Var;
            arrayList3 = arrayList3;
        }
        boolean z2 = false;
        int i4 = 0;
        while (i4 < arrayList4.size()) {
            gl glVar2 = (gl) arrayList4.get(i4);
            boolean z3 = z2;
            int i5 = glVar2.c;
            int i6 = i4;
            if (i5 == 1) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(str2, "vnd.android.cursor.item/email_v2");
                intent2 = intent;
                contentValues2.put(str, glVar2.c(false));
                a(glVar2.a(false), contentValues2);
                arrayList5.add(contentValues2);
                num = num9;
                num3 = num10;
                num4 = num11;
                num5 = num13;
                num2 = num12;
                str3 = str2;
                arrayList2 = arrayList4;
                str4 = str;
                arrayList = arrayList5;
            } else {
                intent2 = intent;
                ArrayList arrayList6 = arrayList4;
                ArrayList<? extends Parcelable> arrayList7 = arrayList5;
                num = num9;
                if (i5 == 3) {
                    ContentValues contentValues3 = new ContentValues();
                    contentValues3.put(str2, "vnd.android.cursor.item/website");
                    String str6 = str2;
                    contentValues3.put(str, glVar2.c(false));
                    String a = glVar2.a(false);
                    if (a.startsWith("X-")) {
                        contentValues3.put("data2", num13);
                        contentValues3.put("data3", a.substring(2));
                    } else if ("HOMEPAGE".equalsIgnoreCase(a)) {
                        contentValues3.put("data2", (Integer) 1);
                    } else if ("BLOG".equalsIgnoreCase(a)) {
                        contentValues3.put("data2", (Integer) 2);
                    } else if ("PROFILE".equalsIgnoreCase(a)) {
                        contentValues3.put("data2", (Integer) 3);
                    } else if ("HOME".equalsIgnoreCase(a)) {
                        contentValues3.put("data2", num11);
                    } else if ("WORK".equalsIgnoreCase(a)) {
                        contentValues3.put("data2", num10);
                    } else if ("FTP".equalsIgnoreCase(a)) {
                        contentValues3.put("data2", num12);
                    } else {
                        if ("OTHER".equalsIgnoreCase(a)) {
                            num8 = num;
                            contentValues3.put("data2", num8);
                        } else {
                            num8 = num;
                            contentValues3.put("data2", num13);
                            contentValues3.put("data3", a);
                        }
                        arrayList = arrayList7;
                        arrayList.add(contentValues3);
                        num = num8;
                        num4 = num11;
                        num5 = num13;
                        num2 = num12;
                        str4 = str;
                        arrayList2 = arrayList6;
                        str3 = str6;
                        num3 = num10;
                    }
                    arrayList = arrayList7;
                    num8 = num;
                    arrayList.add(contentValues3);
                    num = num8;
                    num4 = num11;
                    num5 = num13;
                    num2 = num12;
                    str4 = str;
                    arrayList2 = arrayList6;
                    str3 = str6;
                    num3 = num10;
                } else {
                    String str7 = str2;
                    arrayList = arrayList7;
                    if (i5 == 4) {
                        ContentValues contentValues4 = new ContentValues();
                        contentValues4.put(str7, "vnd.android.cursor.item/note");
                        contentValues4.put(str, glVar2.c(false));
                        arrayList.add(contentValues4);
                        str3 = str7;
                        num3 = num10;
                        num4 = num11;
                        num5 = num13;
                        num2 = num12;
                        arrayList2 = arrayList6;
                        str4 = str;
                    } else {
                        num2 = num12;
                        if (i5 == 5) {
                            ContentValues contentValues5 = new ContentValues();
                            contentValues5.put(str7, "vnd.android.cursor.item/contact_event");
                            contentValues5.put(str, glVar2.c(false));
                            contentValues5.put("data2", (Integer) 3);
                            arrayList.add(contentValues5);
                            num3 = num10;
                            num4 = num11;
                            num5 = num13;
                            str3 = str7;
                            str4 = str;
                        } else {
                            num3 = num10;
                            num4 = num11;
                            num5 = num13;
                            if (i5 == 2) {
                                ContentValues contentValues6 = new ContentValues();
                                contentValues6.put(str7, "vnd.android.cursor.item/postal-address_v2");
                                String[] b = glVar2.b();
                                str5 = str;
                                if (b.length > 0) {
                                    contentValues6.put("data5", b[0]);
                                }
                                if (b.length > 1) {
                                    contentValues6.put("data6", b[1]);
                                }
                                if (b.length > 2) {
                                    contentValues6.put("data4", b[2]);
                                }
                                if (b.length > 3) {
                                    contentValues6.put("data7", b[3]);
                                }
                                if (b.length > 4) {
                                    contentValues6.put("data8", b[4]);
                                }
                                if (b.length > 5) {
                                    contentValues6.put("data9", b[5]);
                                }
                                if (b.length > 6) {
                                    contentValues6.put("data10", b[6]);
                                }
                                String a2 = glVar2.a(false);
                                if ("HOME".equalsIgnoreCase(a2)) {
                                    contentValues6.put("data2", (Integer) 1);
                                } else if ("WORK".equalsIgnoreCase(a2)) {
                                    contentValues6.put("data2", (Integer) 2);
                                } else if ("OTHER".equalsIgnoreCase(a2)) {
                                    contentValues6.put("data2", (Integer) 3);
                                }
                                arrayList.add(contentValues6);
                                str3 = str7;
                            } else {
                                String str8 = str;
                                if (i5 == 20) {
                                    ContentValues contentValues7 = new ContentValues();
                                    contentValues7.put(str7, "vnd.android.cursor.item/im");
                                    String a3 = glVar2.a(true);
                                    String a4 = glVar2.a(false);
                                    str3 = str7;
                                    contentValues7.put(str8, glVar2.c(false));
                                    if ("AIM".equalsIgnoreCase(a3)) {
                                        num7 = num5;
                                        contentValues7.put("data5", num7);
                                        str5 = str8;
                                    } else {
                                        str5 = str8;
                                        num7 = num5;
                                        if ("MSN".equalsIgnoreCase(a3)) {
                                            contentValues7.put("data5", (Integer) 1);
                                        } else if ("YAHOO".equalsIgnoreCase(a3)) {
                                            contentValues7.put("data5", (Integer) 2);
                                        } else if ("SKYPE".equalsIgnoreCase(a3)) {
                                            contentValues7.put("data5", (Integer) 3);
                                        } else if ("QQ".equalsIgnoreCase(a3)) {
                                            contentValues7.put("data5", num4);
                                        } else if ("GOOGLE-TALK".equalsIgnoreCase(a3)) {
                                            contentValues7.put("data5", num3);
                                        } else if ("ICQ".equalsIgnoreCase(a3)) {
                                            contentValues7.put("data5", num2);
                                        } else if ("JABBER".equalsIgnoreCase(a3)) {
                                            contentValues7.put("data5", num);
                                        } else if ("NETMEETING".equalsIgnoreCase(a3)) {
                                            contentValues7.put("data5", (Integer) 8);
                                        } else {
                                            contentValues7.put("data5", (Integer) (-1));
                                            contentValues7.put("data6", glVar2.a(true));
                                        }
                                    }
                                    if ("HOME".equalsIgnoreCase(a4)) {
                                        contentValues7.put("data2", (Integer) 1);
                                    } else if ("WORK".equalsIgnoreCase(a4)) {
                                        contentValues7.put("data2", (Integer) 2);
                                    } else if ("OTHER".equalsIgnoreCase(a4)) {
                                        contentValues7.put("data2", (Integer) 3);
                                    }
                                    arrayList.add(contentValues7);
                                    num5 = num7;
                                } else {
                                    str3 = str7;
                                    Integer num14 = num5;
                                    str4 = str8;
                                    if (i5 == 6 && !z3) {
                                        ContentValues contentValues8 = new ContentValues();
                                        String str9 = str3;
                                        contentValues8.put(str9, "vnd.android.cursor.item/organization");
                                        int i7 = i6;
                                        while (i7 < arrayList6.size()) {
                                            ArrayList arrayList8 = arrayList6;
                                            gl glVar3 = (gl) arrayList8.get(i7);
                                            int i8 = i7;
                                            String str10 = str9;
                                            if (glVar3.c == 6) {
                                                String a5 = glVar3.a(true);
                                                if ("ORG".equalsIgnoreCase(a5)) {
                                                    String[] b2 = glVar3.b();
                                                    if (b2.length != 0) {
                                                        num6 = num14;
                                                        if (b2.length >= 1) {
                                                            contentValues8.put(str4, b2[0]);
                                                        }
                                                        if (b2.length >= 2) {
                                                            contentValues8.put("data5", b2[1]);
                                                        }
                                                    }
                                                } else {
                                                    num6 = num14;
                                                    if ("TITLE".equalsIgnoreCase(a5)) {
                                                        contentValues8.put("data4", glVar3.c(false));
                                                    } else if ("ROLE".equalsIgnoreCase(a5)) {
                                                        contentValues8.put("data4", glVar3.c(false));
                                                    }
                                                }
                                                String a6 = glVar3.a(true);
                                                if ("WORK".equalsIgnoreCase(a6)) {
                                                    contentValues8.put("data2", (Integer) 1);
                                                } else if ("OTHER".equalsIgnoreCase(a6)) {
                                                    contentValues8.put("data2", (Integer) 2);
                                                }
                                                i7 = i8 + 1;
                                                arrayList6 = arrayList8;
                                                num14 = num6;
                                                str9 = str10;
                                            }
                                            num6 = num14;
                                            i7 = i8 + 1;
                                            arrayList6 = arrayList8;
                                            num14 = num6;
                                            str9 = str10;
                                        }
                                        str3 = str9;
                                        num5 = num14;
                                        arrayList2 = arrayList6;
                                        arrayList.add(contentValues8);
                                        z = true;
                                        i4 = i6 + 1;
                                        z2 = z;
                                        str = str4;
                                        arrayList5 = arrayList;
                                        arrayList4 = arrayList2;
                                        intent = intent2;
                                        num12 = num2;
                                        num9 = num;
                                        num10 = num3;
                                        num11 = num4;
                                        num13 = num5;
                                        str2 = str3;
                                    } else {
                                        num5 = num14;
                                    }
                                }
                            }
                            arrayList2 = arrayList6;
                            str4 = str5;
                        }
                        arrayList2 = arrayList6;
                    }
                }
            }
            z = z3;
            i4 = i6 + 1;
            z2 = z;
            str = str4;
            arrayList5 = arrayList;
            arrayList4 = arrayList2;
            intent = intent2;
            num12 = num2;
            num9 = num;
            num10 = num3;
            num11 = num4;
            num13 = num5;
            str2 = str3;
        }
        Intent intent3 = intent;
        intent3.putExtra("finishActivityOnSaveCompleted", true);
        intent3.putParcelableArrayListExtra("data", arrayList5);
        try {
            r78Var.s1.getParentActivity().startActivity(intent3);
            r78Var.dismiss();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
