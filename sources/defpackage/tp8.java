package defpackage;

import android.graphics.RectF;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import org.telegram.ui.ProfileActivity;
public final class tp8 implements Consumer {
    public final byte a;
    public final Object b;

    public tp8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                RectF rectF = ProfileActivity.Z6;
                HashSet hashSet = profileActivity.n5;
                ArrayList arrayList = new ArrayList((HashSet) obj);
                int i = 0;
                while (i < arrayList.size()) {
                    if (profileActivity.getMessagesController().g4.f(profileActivity.f1, ((Integer) arrayList.get(i)).intValue()) == null) {
                        arrayList.remove(i);
                        i--;
                    }
                    i++;
                }
                hashSet.clear();
                hashSet.addAll(arrayList);
                profileActivity.b4(true);
                return;
            default:
                hl.c3(new z3b((q5b) obj2, (List) obj, (byte) 4));
                return;
        }
    }

    public final Consumer andThen(Consumer consumer) {
        byte b = this.a;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
