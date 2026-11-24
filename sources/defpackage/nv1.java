package defpackage;

import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class nv1 {
    public k47 a;
    public int b;
    public int c;
    public byte[] e;
    public boolean f;
    public boolean h;
    public String i;
    public ArrayList j;
    public TLRPC.TodoItem k;
    public TLRPC.PollAnswer l;
    public boolean m;
    public ArrayList n;
    public int o;
    public boolean g = false;
    public int d = -1;

    public nv1(int i, int i2, k47 k47Var) {
        TLRPC.Message message;
        this.a = k47Var;
        this.b = i;
        this.c = i2;
        boolean z = false;
        if (k47Var != null && (message = k47Var.k) != null && message.rich_message != null) {
            z = true;
        }
        this.m = z;
        f();
    }

    public static nv1 b(int i, int i2, k47 k47Var) {
        if (k47Var == null) {
            return null;
        }
        k47.B0(k47Var.k);
        return new nv1(i, i2, k47Var);
    }

    public static nv1 c(k47 k47Var) {
        TLRPC.Message message = k47Var.k;
        if (message != null) {
            if (message.message != null || (message != null && message.rich_message != null)) {
                return b(0, Math.min(oc7.r1(k47Var.K1).l4.N1.f(), d(k47Var)), k47Var);
            }
            return null;
        }
        return null;
    }

    public static int d(k47 k47Var) {
        CharSequence charSequence;
        TLRPC.Message message = k47Var.k;
        if (message != null) {
            if (message != null && message.rich_message != null) {
                uj9 uj9Var = k47Var.y2;
                if (uj9Var != null && (charSequence = uj9Var.q) != null) {
                    return charSequence.length();
                }
                return 0;
            }
            String str = message.message;
            if (str == null) {
                return 0;
            }
            return str.length();
        }
        return 0;
    }

    public final void a(k47 k47Var) {
        String str;
        int i;
        int i2;
        TL_iv.RichMessage richMessage;
        yj9 yj9Var;
        int[] iArr;
        boolean z = this.m;
        TLRPC.Message message = k47Var.k;
        if (z) {
            if (message != null && (richMessage = message.rich_message) != null) {
                this.a = k47Var;
                String str2 = this.i;
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    ArrayList e = yj9.e(richMessage);
                    StringBuilder sb = new StringBuilder();
                    int i3 = 0;
                    while (true) {
                        yj9Var = null;
                        if (i3 >= e.size()) {
                            break;
                        }
                        if (i3 > 0) {
                            sb.append('\n');
                        }
                        yj9.b((TL_iv.RichText) e.get(i3), sb, null);
                        i3++;
                    }
                    if (sb.indexOf(str2) >= 0) {
                        if (yj9.c(k47Var)) {
                            iArr = yj9.f(k47Var, this.i, this.o);
                        } else {
                            iArr = null;
                        }
                        if (iArr != null) {
                            yj9Var = yj9.k(iArr[0], iArr[1], k47Var);
                        }
                        if (yj9Var != null) {
                            this.b = iArr[0];
                            this.c = iArr[1];
                            e(yj9Var.b, yj9Var.a);
                        } else {
                            this.b = -1;
                            this.c = -1;
                        }
                        this.f = false;
                        return;
                    }
                }
                this.b = 0;
                this.c = Math.min(oc7.r1(k47Var.K1).l4.N1.f(), d(k47Var));
                this.f = true;
                return;
            }
            fc4.d("ReplyQuote.checkEdit: rich message is null");
            this.f = false;
        } else if (message != null && (str = message.message) != null) {
            int i4 = this.c;
            if (i4 >= this.b && i4 <= str.length() && this.b <= k47Var.k.message.length() && (i = this.b) >= 0 && (i2 = this.c) >= 0) {
                if (TextUtils.equals(this.i, k47Var.k.message.substring(i, i2))) {
                    this.a = k47Var;
                    f();
                    this.f = false;
                    return;
                }
                int indexOf = k47Var.k.message.indexOf(this.i);
                if (indexOf >= 0) {
                    this.a = k47Var;
                    this.c = (this.c - this.b) + indexOf;
                    this.b = indexOf;
                    f();
                    this.f = false;
                    return;
                }
                this.a = k47Var;
                this.b = 0;
                this.c = k47Var.k.message.length();
                f();
                this.f = true;
                return;
            }
            fc4.d("ReplyQuote.checkEdit: start/end are invalid (" + this.b + ", " + this.c + ", len=" + k47Var.k.message.length() + ")");
            this.f = false;
        } else {
            fc4.d("ReplyQuote.checkEdit: message is null");
            this.f = false;
        }
    }

    public final void e(int i, ArrayList arrayList) {
        this.n = arrayList;
        this.o = i;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            this.j = arrayList2;
            this.i = yj9.h(arrayList, arrayList2);
            return;
        }
        this.n = null;
        this.i = null;
        this.j = null;
    }

    public final void f() {
        TLRPC.Message message;
        String str;
        int i;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        int i2;
        if (this.m) {
            int i3 = this.b;
            if (i3 >= 0 && (i2 = this.c) >= 0) {
                yj9 k = yj9.k(i3, i2, this.a);
                if (k == null) {
                    fc4.d("ReplyQuote: failed to build a rich quote (" + this.b + ", " + this.c + ")");
                    e(0, null);
                    return;
                }
                e(k.b, k.a);
                return;
            }
            return;
        }
        k47 k47Var = this.a;
        if (k47Var != null && (message = k47Var.k) != null && (str = message.message) != null) {
            if (this.g) {
                TLRPC.TodoItem Z = k47.Z(this.d, k47Var);
                if (Z == null) {
                    fc4.d("ReplyQuote: todo task is not found");
                    return;
                } else {
                    this.k = Z;
                    return;
                }
            } else if (this.h) {
                TLRPC.PollAnswer X = k47.X(k47Var, this.e);
                if (X == null) {
                    fc4.d("ReplyQuote: poll item is not found");
                    return;
                } else {
                    this.l = X;
                    return;
                }
            } else {
                int i4 = this.c;
                if (i4 >= this.b && i4 <= str.length() && this.b <= this.a.k.message.length() && (i = this.b) >= 0 && this.c >= 0) {
                    String str2 = this.a.k.message;
                    int max = Math.max(0, i);
                    while (max < this.c && Character.isWhitespace(str2.charAt(max))) {
                        max++;
                    }
                    int min = Math.min(this.c, str2.length());
                    while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                        min--;
                    }
                    if (max == min) {
                        fc4.d("ReplyQuote: message is full of whitespace");
                        return;
                    }
                    this.i = this.a.k.message.substring(max, min);
                    ArrayList arrayList = this.j;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    ArrayList<TLRPC.MessageEntity> arrayList2 = this.a.k.entities;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        for (int i5 = 0; i5 < this.a.k.entities.size(); i5++) {
                            TLRPC.MessageEntity messageEntity = this.a.k.entities.get(i5);
                            int i6 = messageEntity.offset;
                            int i7 = messageEntity.length + i6;
                            Typeface typeface = gm.a;
                            if (Math.max(max, min) >= Math.min(i6, i7) && Math.max(i6, i7) >= Math.min(max, min)) {
                                if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                    tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityBold();
                                } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                    tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityItalic();
                                } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                    tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityUnderline();
                                } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                    tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityStrike();
                                } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                    tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntitySpoiler();
                                } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = new TLRPC.TL_messageEntityCustomEmoji();
                                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji3 = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                    tL_messageEntityCustomEmoji2.document_id = tL_messageEntityCustomEmoji3.document_id;
                                    tL_messageEntityCustomEmoji2.document = tL_messageEntityCustomEmoji3.document;
                                    tL_messageEntityCustomEmoji = tL_messageEntityCustomEmoji2;
                                }
                                int i8 = messageEntity.offset;
                                int i9 = i8 - max;
                                int i10 = (i8 + messageEntity.length) - max;
                                if ((i9 >= 0 || i10 >= 0) && (i9 <= min || i10 <= min)) {
                                    tL_messageEntityCustomEmoji.offset = Math.max(0, i9);
                                    tL_messageEntityCustomEmoji.length = Math.min(i10, min - max) - tL_messageEntityCustomEmoji.offset;
                                    ArrayList arrayList3 = this.j;
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        this.j = arrayList3;
                                    }
                                    arrayList3.add(tL_messageEntityCustomEmoji);
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                fc4.d("ReplyQuote: start/end are invalid (" + this.b + ", " + this.c + ", len=" + this.a.k.message.length() + ")");
                return;
            }
        }
        fc4.d("ReplyQuote: message is null");
    }
}
