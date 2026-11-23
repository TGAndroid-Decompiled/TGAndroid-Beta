package g0;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import e0.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class c {
    public Context f13056a;
    public String f13057b;
    public Intent[] f13058c;
    public ComponentName d;
    public CharSequence f13059e;
    public CharSequence f13060f;
    public CharSequence f13061g;
    public IconCompat h;
    public j0[] f13062i;
    public Set f13063j;
    public f0.g f13064k;
    public boolean f13065l;
    public int f13066m;
    public PersistableBundle f13067n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f13057b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f13058c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f13056a, this.f13057b).setShortLabel(this.f13059e).setIntents(this.f13058c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f13056a));
        }
        if (!TextUtils.isEmpty(this.f13060f)) {
            intents.setLongLabel(this.f13060f);
        }
        if (!TextUtils.isEmpty(this.f13061g)) {
            intents.setDisabledMessage(this.f13061g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f13063j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f13066m);
        PersistableBundle persistableBundle = this.f13067n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i7 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            j0[] j0VarArr = this.f13062i;
            if (j0VarArr != null && j0VarArr.length > 0) {
                int length = j0VarArr.length;
                Person[] personArr = new Person[length];
                while (i7 < length) {
                    j0 j0Var = this.f13062i[i7];
                    j0Var.getClass();
                    personArr[i7] = d1.f.E(j0Var);
                    i7++;
                }
                intents.setPersons(personArr);
            }
            f0.g gVar = this.f13064k;
            if (gVar != null) {
                intents.setLocusId(gVar.f11010b);
            }
            intents.setLongLived(this.f13065l);
        } else {
            if (this.f13067n == null) {
                this.f13067n = new PersistableBundle();
            }
            j0[] j0VarArr2 = this.f13062i;
            if (j0VarArr2 != null && j0VarArr2.length > 0) {
                this.f13067n.putInt("extraPersonCount", j0VarArr2.length);
                while (i7 < this.f13062i.length) {
                    PersistableBundle persistableBundle2 = this.f13067n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i10 = i7 + 1;
                    sb2.append(i10);
                    String sb3 = sb2.toString();
                    j0 j0Var2 = this.f13062i[i7];
                    j0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = j0Var2.f10223a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", j0Var2.f10225c);
                    persistableBundle3.putString("key", j0Var2.d);
                    persistableBundle3.putBoolean("isBot", j0Var2.f10226e);
                    persistableBundle3.putBoolean("isImportant", j0Var2.f10227f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i7 = i10;
                }
            }
            f0.g gVar2 = this.f13064k;
            if (gVar2 != null) {
                this.f13067n.putString("extraLocusId", gVar2.f11009a);
            }
            this.f13067n.putBoolean("extraLongLived", this.f13065l);
            intents.setExtras(this.f13067n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.i(intents);
        }
        return intents.build();
    }
}
